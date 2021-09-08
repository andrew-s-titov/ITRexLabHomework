package titov.homework1.task2.cars;

import java.util.Objects;

public class CamperVan extends Car {
    private final int sleepPlaces;
    private final int gasCapacity;

    public CamperVan(String brand, String model, int manufactureYear, String color, int sleepPlaces, int gasCapacity) {
        super(brand, model, manufactureYear, color);
        this.sleepPlaces = Math.max(sleepPlaces, 1);
        this.gasCapacity = Math.max(gasCapacity, 5);
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public int getSleepPlaces() {
        return sleepPlaces;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", sleep places: " + sleepPlaces
                + ", gas capacity(L): " + gasCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CamperVan car = (CamperVan) o;
        return getManufactureYear() == car.getManufactureYear() &&
                getSleepPlaces() == car.getSleepPlaces() &&
                getGasCapacity() == car.getGasCapacity() &&
                // "null-safe" : null equals null
                // could use String.equals if a field is not-null
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sleepPlaces;
        result = 31 * result + gasCapacity;
        return result;
    }
}
