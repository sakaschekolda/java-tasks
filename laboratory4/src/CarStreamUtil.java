import java.io.*;
import java.util.Arrays;

public class CarStreamUtil {
    // Запись в байтовый поток
    public static void output(Car car, OutputStream out) throws IOException {
        car.output(out);
    }

    // Чтение из байтового потока
    public static Car input(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        return (Car) objectInputStream.readObject();
    }

    // Запись в символьный поток
    public static void write(Car car, Writer out) throws IOException {
        car.write(out);
    }

    // Чтение из символьного потока
    public static Car read(Reader in) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(in);
        String line = bufferedReader.readLine();
        String[] parts = line.split(" ");

        return new Truck(Integer.parseInt(parts[0]), parts[1], Arrays.copyOfRange(parts, 2, parts.length));
    }
}
