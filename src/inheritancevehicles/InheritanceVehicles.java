package inheritancevehicles;

public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles();
        // vehicle.speed(100, 1);
        // vehicle.weight(10, 10, 10);

        Vans van = new Vans();
        // van.speed(10, 1);
        // van.weight(20, 20, 20);
        // van.windows_count(2);

        Cars car = new Cars(3);
        // car.speed(10, 1);
        // car.weight(30, 30, 30);

        System.out.println("");
    }

}
