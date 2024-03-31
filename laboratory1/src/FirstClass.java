import FirstPackage.SecondClass;

public class FirstClass{
    public static void main(String[] args) {
        SecondClass<Integer> object = new SecondClass<Integer>(10, 10);
        System.out.println(object);
        object.Metod1(10, 10);
    }
}