package titov.homework1.task2;

import titov.homework1.task2.cars.*;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        SportCar supra1 = new SportCar("Toyota", "Supra", 2015, "red", 280);
        // add 2 same Supras
        garage.park(supra1);
        garage.park(supra1);
        // add some different sport cars
        garage.park(new SportCar("Lamborghini", "Aventador", 2017, "yellow", 310));
        garage.park(new SportCar("Bugatti", "Veyron", 2012, "silver", 380));
        // add other cars
        garage.park(new CamperVan("Fiat", "Ducato Motorhome", 2009, "white",
                2, 5));
        garage.park(new Limousine("Chrysler", "300C", 2009, "white",
                5, 15));
        garage.park(new Truck("Volvo", "FH", 2012, "black",
                4, 15000));

        // Checking .toString
        System.out.println(supra1);

        // expecting 2
        System.out.println("Red Supra 2015 with 280 km/h in the garage: " + garage.countSame(supra1));
        // expecting 4
        System.out.println("Sport cars in the garage: " + garage.countSameType(SportCar.class));

        if (garage.leave(supra1)) {
            System.out.println("- - - One Supra left. - - -");
        };

        // expecting 1
        System.out.println("Red Supra 2015 with 280 km/h in the garage: " + garage.countSame(supra1));
        // expecting 3
        System.out.println("Sport cars in the garage: " + garage.countSameType(SportCar.class));

        // expecting 1
        System.out.println("Campers in the garage: " + garage.countSameType(CamperVan.class));
    }
}
