import java.util.*;

class Executable {
    public static void main(String[] args) {
        String[] fuelForSportCar = { "Gasoline", "Rolf" };
        SportCar sport = new SportCar();

        System.out.println("Wheels amount: " + sport.getWheels());
        System.out.println("Model name: "+ sport.getName());
        System.out.println(sport.getFuel( 0));
        System.out.println(sport.getFuel(1));

        SportCar sport1 = new SportCar(4, "Audi A8", fuelForSportCar);

        System.out.println("\nConstructor: ");

        sport1.getWheels();
        sport1.getName();
        sport1.getFuel(0);
        sport1.getFuel(2);

        System.out.println("\ntoString " + sport);
        System.out.println("equals() Wheels: " + sport.equals(sport));
        System.out.println("equals() Wheels: " + sport.equals(sport1));

        System.out.println("hashCode: " + sport.hashCode());
        System.out.println("\t  " + sport1.hashCode());

        Truck truck = new Truck();
        System.out.println("\n" + "Truck: " + truck);
        System.out.println("Truck: " + truck.getWheels());
        System.out.println("Truck: " + truck.getName());

        String[] fuelForTruck = { "Diesel", "Machine Oil", "Air" };

        Truck truck1 = new Truck(10, "Mercedes-Benz Actros", fuelForTruck);
        Truck truckcopy = truck;

        System.out.println("Constructor methods check");
        System.out.println("Wheels amount: " + truck1.getWheels());
        System.out.println("Model's name: " + truck1.getName());
        System.out.println("Model's consumable: " + truck1.getFuel(0));
        System.out.println("Model's consumable: " + truck1.getFuel(1));

        try {
            System.out.println(truck1.consumeFuel(2));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Methods toString, equals, hashCode check: ");
        System.out.println("toString: " + truck1);
        System.out.println("equals:");
        System.out.println(truck1.equals(truck));
        System.out.println(truck1.equals(truckcopy));
        System.out.println("hashCode:");
        System.out.println(truck1.hashCode());
        System.out.println(truck.hashCode());

        Car[] arr = {new SportCar(4, "Aventador", fuelForSportCar), new Truck(10, "Mercedes-Benz", fuelForTruck), new SportCar(4, "Gallardo", fuelForSportCar), new Truck(8, "MAN", fuelForTruck), new SportCar(4, "Countach", fuelForSportCar), new Truck(8, "Kamaz", fuelForTruck), new SportCar(4, "Veyron", fuelForSportCar), new Truck(12, "Volvo", fuelForTruck)};
        List<Car> newCars = new ArrayList<Car>();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if(arr[i].consumeFuel(0).equals(arr[j].consumeFuel(0))) {
                        newCars.add(arr[i]);
                    }
                };
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if(arr[arr.length - 1].consumeFuel(0).equals(arr[arr.length - 1].consumeFuel(0))) {
                newCars.add(arr[arr.length - 1]);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < newCars.size(); i++) {
            System.out.println("\n" + newCars.get(i));
        }


        List<Car> sportcars = new ArrayList<Car>();
        List<Car> trucks = new ArrayList<Car>();
        for (int i = 0; i < newCars.size(); i++) {
            if(newCars.get(i) instanceof SportCar) {
                sportcars.add(newCars.get(i));
            } else {
                trucks.add(newCars.get(i));
            }
        }

        System.out.println(sportcars);
        System.out.println(trucks);
    }

}