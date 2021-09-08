package titov.homework1.task2;

import titov.homework1.task2.cars.Car;
import titov.homework1.task2.cars.SportCar;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car supra1 = new SportCar("Toyota", "Supra", 2015, "red", 280);
        garage.park(supra1);
        // add 2 new objects, but equivalent to supra1
        garage.park(new SportCar("Toyota", "Supra", 2015, "red", 280));
        garage.park(new SportCar("Toyota", "Supra", 2015, "red", 280));
        // add some different Supras
        garage.park(new SportCar("Toyota", "Supra", 2015, "red", 250));
        garage.park(new SportCar("Toyota", "Supra", 2017, "white", 320));

        // expecting 3
        System.out.println("Red Supra 2015 with 280 km/h: " + garage.countSame(supra1));

        garage.leave(supra1);
        // expecting 2
        System.out.println("Red Supra 2015 with 280 km/h: " + garage.countSame(supra1));

        garage.leave(supra1);
        // expecting 1
        System.out.println("Red Supra 2015 with 280 km/h: " + garage.countSame(supra1));

        System.out.println(supra1);
    }
}
