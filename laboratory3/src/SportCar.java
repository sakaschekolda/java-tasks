public class SportCar implements Car {
    int wheels = 4;
    String name = "Lexus LFA";
    String[] fuel = { "Gasoline", "Machine Oil" };

    public SportCar() {
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return this.name;
    }

    public String getFuel(int ind) {
        return this.fuel[ind];
    }


    public String consumeFuel(int ind) {
        return "Fuel" + this.name + "а: " + this.fuel[ind];
    }

    public SportCar(int w, String n, String[] f) {
        this.wheels = w;
        this.name = n;
        this.fuel = f;
    }

    public void wheels(int w) {
        System.out.println(this.wheels);
    }

    public void name(String n) {
        System.out.println(this.name);
    }

    public void fuelK(int index) {
        System.out.println(this.fuel[index]);
    }

    public String toString() {
        return "Car's model: " + name;
    }

    public boolean equals(Object obj) {
        SportCar otherCar = (SportCar) obj;
        return this.wheels == otherCar.wheels;
    }

    public int hashCode() {
        int h1 = 1;
        h1 = 31 * h1 + ((name == null) ? 0 : name.hashCode());
        h1 = 31 * h1 + wheels;
        h1 = 31 * h1 + ((name == null) ? 0 : name.hashCode());
        return h1;
    }

}