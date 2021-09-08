package titov.homework1.task2.cars;

import java.util.Objects;

public class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String brand, String model, int manufactureYear, String color, int maxSpeed) {
        super(brand, model, manufactureYear, color);
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 120;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", max speed: " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar car = (SportCar) o;
        return getManufactureYear() == car.getManufactureYear() &&
                getMaxSpeed() == car.getMaxSpeed() &&
                // "null-safe" : null equals null
                // could use String.equals if a field is not-null
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
