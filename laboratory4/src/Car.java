import java.io.*;
public interface Car {
    public int getWheels();

    public String getFuel(int index);

    public String getName();

    public String consumeFuel(int index) throws Exception;
    void output(OutputStream out) throws IOException;
    void write(Writer out) throws IOException;
}