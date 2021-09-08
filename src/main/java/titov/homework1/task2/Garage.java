package titov.homework1.task2;

import titov.homework1.task2.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final Map<Car, Integer> garage = new HashMap<>();

    public void park(Car car) {
        if (garage.containsKey(car)) {
            int carCount = garage.get(car);
            garage.put(car, carCount + 1);
        } else {
            garage.put(car, 1);
        }
    }

    public boolean leave(Car car) {
        if (garage.containsKey(car)) {
            int carCount = garage.get(car);
            if (carCount == 1) {
                garage.remove(car);
            } else {
                garage.put(car, carCount-1);
            }
            return true;
        } else {
            return false;
        }
    }

    public int countSame(Car car) {
        return garage.getOrDefault(car, 0);
    }
}
