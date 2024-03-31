import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public class Truck implements Car, Serializable{
    private int wheels = 10;
    private String name = "MAN";
    private String[] fuel = { "Diesel", "Machine Oil" };;

    public Truck() {
    }

    public Truck(int wheels, String name, String[] fuel) {
        this.wheels = wheels;
        this.name = name;
        this.fuel = fuel;
    }

    public String getFuel(int index) {
        return this.fuel[index];
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getName() {
        return this.name;
    }

    public String consumeFuel(int index) throws Exception {
        try {
            if (index > 2) {
                throw new Exception("This isn't a car");
            }
            return this.name + " consumed " + this.fuel[index];
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    @Override
    public void output(OutputStream out) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(this);
    }

    @Override
    public void write(Writer out) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(out);
        bufferedWriter.write(this.getWheels() + " " + this.getName() + " " + String.join(" ", this.fuel));
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }


    public String toString() {
        return "Model's name " + getName();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {

        int res = 1;
        res = 31 * res + ((name == null) ? 0 : name.hashCode());
        res = 31 * res + wheels;
        res = 31 * res + ((name == null) ? 0 : name.hashCode());

        return res;
    }

}