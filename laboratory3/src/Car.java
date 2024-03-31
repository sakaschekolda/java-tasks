public interface Car {
    public int getWheels();

    public String getFuel(int index);

    public String getName();

    public String consumeFuel(int index) throws Exception;
}