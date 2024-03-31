import java.lang.Thread;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

//поток 1
public class MyThreads extends Thread{
    static ArrayList<Integer> DELL = new ArrayList<>();
    static BigInteger FACT;
    @Override
    public void run() {
        BigInteger mult = BigInteger.ONE;
        System.out.println("Поток 1: \n" + "Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 999 || num <= 99) {
            System.out.println("Введите число от 100 до 999");
            System.exit(1);
        }

        for (int i = 1; i <= num; i++) {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        FACT=mult;

        System.out.println("Факториал " + num + " = " + mult);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr.add(i);
                DELL.add(i);
            }
        }
        System.out.println("Делители " + num + " = " + arr);
    }

    public static void main(String[] args){
        MyThreads factorr = new MyThreads();
        factorr.start();
        //поток 2
        Runnable runnable = () -> {

            //созздание файла Факториал.txt
            try {
                factorr.join();
                System.out.println("Поток 2:");
                MyThreads.sleep(1000);
                File fileFact = new File("Факториал.txt");
                if (fileFact.createNewFile()){
                    System.out.println("Файл создан");
                }else{
                    System.out.println("Файл уже существует");
                }
            } catch (Exception e) {
                System.out.println("Ошибка при создании файла");
                throw new RuntimeException(e);
            }

            //создание файла Делитети.txt
            try {
                File fileDel = new File("Делители.txt");
                if (fileDel.createNewFile()){
                    System.out.println("Файл создан");
                }else{
                    System.out.println("Файл уже существует");
                }
            } catch (Exception e) {
                System.out.println("Ошибка при создании файла");
                throw new RuntimeException(e);
            }

            //запись в файл Факториал.txt
            try {
                FileWriter writerFact = new FileWriter("Факториал.txt");

                writerFact.write(String.valueOf(FACT));
                writerFact.close();
            } catch (Exception e) {
                System.out.println("Ошибка при записи");
                throw new RuntimeException(e);
            }

            //запись в файл Делитети.txt
            try {
                FileWriter writerDel = new FileWriter("Делители.txt");

                writerDel.write(String.valueOf(DELL));
                writerDel.close();
            } catch (Exception e) {
                System.out.println("Ошибка при записи");
                throw new RuntimeException(e);
            }

        };
        Thread zapis = new Thread(runnable);
        zapis.start();
    }
}