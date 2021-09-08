package titov.homework1.task2.cars;

import java.time.Year;
import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String model;
    private final int manufactureYear;
    private final String color;

    Car(String brand, String model, int manufactureYear, String color) {
        this.brand = brand;
        this.model = model;
        int currentYear = Year.now().getValue();
        this.manufactureYear = manufactureYear > 1885 && manufactureYear <= currentYear ? manufactureYear : currentYear;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", year: " + manufactureYear + ", color: " + color;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + manufactureYear;
        result = 31 * result + brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + color.hashCode();
        return result;
        // could use this:
        // return Objects.hash(brand, model, color, manufactureYear);
    }
}