package titov.homework1.task2.cars;

import java.util.Objects;

public class Limousine extends Car {
    private final int length;
    private final int barCapacityL;

    public Limousine(String brand, String model, int manufactureYear, String color, int length, int barCapacityL) {
        super(brand, model, manufactureYear, color);
        this.barCapacityL = barCapacityL >= 0 ? barCapacityL : 2;
        this.length = Math.max(length, 3);
    }

    public int getLength() {
        return length;
    }

    public int getBarCapacityL() {
        return barCapacityL;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", length: " + length
                + ", bar capacity(L): " + barCapacityL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Limousine car = (Limousine) o;
        return getManufactureYear() == car.getManufactureYear() &&
                getLength() == car.getLength() &&
                getBarCapacityL() == car.getBarCapacityL() &&
                // "null-safe" : null equals null
                // could use String.equals if a field is not-null
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + length;
        result = 31 * result + barCapacityL;
        return result;
    }
}
