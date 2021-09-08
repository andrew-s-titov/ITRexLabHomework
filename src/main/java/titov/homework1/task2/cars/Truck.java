package titov.homework1.task2.cars;

import java.util.Objects;

public class Truck extends Car {
    private final int numberOfAxles;
    private final int maxWeightKG;

    public Truck(String brand, String model, int manufactureYear, String color, int numberOfAxles, int maxWeightKG) {
        super(brand, model, manufactureYear, color);
        this.numberOfAxles = Math.max(numberOfAxles, 3);
        this.maxWeightKG = Math.max(maxWeightKG, 3500);
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public int getMaxWeightKG() {
        return maxWeightKG;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", number of axles: " + numberOfAxles
                + ", max weight: " + maxWeightKG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck car = (Truck) o;
        return getManufactureYear() == car.getManufactureYear() &&
                getNumberOfAxles() == car.getNumberOfAxles() &&
                getMaxWeightKG() == car.getMaxWeightKG() &&
                // "null-safe" : null equals null
                // could use String.equals if a field is not-null
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfAxles;
        result = 31 * result + maxWeightKG;
        return result;
    }
}
