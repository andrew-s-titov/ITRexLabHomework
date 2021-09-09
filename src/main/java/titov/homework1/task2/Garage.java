package titov.homework1.task2;

import titov.homework1.task2.cars.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Garage {
    private final Map<Car, Integer> garage = new HashMap<>();

    /**
     * Adds a car to the garage
     * @param car a car to park
     */
    public void park(Car car) {
        if (garage.containsKey(car)) {
            int carCount = garage.get(car);
            garage.put(car, carCount + 1);
        } else {
            garage.put(car, 1);
        }
    }

    /**
     * Allow to take a car out of the garage
     * @param car a car to leave the garage
     * @return true if such car was in the garage and left, false if there's no such car
     */
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

    /**
     * Counts number of the exactly the same cars
     * @param car searched car
     * @return number of exactly the same cars
     */
    public int countSame(Car car) {
        return garage.getOrDefault(car, 0);
    }

    /**
     * Counts number of cars in the garage of a given type (class)
     * @param carType searched car type (Car heir)
     * @return number of cars of the given type
     */
    public int countSameType(Class<? extends Car> carType) {
        int count = 0;
        Set<Map.Entry<Car, Integer>> garageEntries = garage.entrySet();
        for (Map.Entry<Car, Integer> garageEntry : garageEntries) {
            if (garageEntry.getKey().getClass().equals(carType)) {
                count += garageEntry.getValue();
            }
        }
        return count;
    }
}
