import java.io.*;

public class CarSerializationUtil {
    // Запись сериализованного объекта
    public static void serialize(Car car, OutputStream out) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(car);
    }

    // Чтение десериализованного объекта
    public static Car deserialize(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        return (Car) objectInputStream.readObject();
    }
}
