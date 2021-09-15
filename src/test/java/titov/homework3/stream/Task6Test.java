package titov.homework3.stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Task6Test {
    Gson gson = new Gson();
    Type type = new TypeToken<List<Department>>(){}.getType();

    @Test
    public void calcNumberOfEmployees() {
        try (JsonReader reader = new JsonReader(new FileReader("src/main/resources/departments.json"))) {
            List<Department> departments = gson.fromJson(reader, type);
            Assertions.assertEquals(departments.size(), 2);
            Assertions.assertEquals(1, Task6.calcNumberOfEmployees(departments, 20000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calcNumberOfEmployeesOther() {
        try (JsonReader reader = new JsonReader(new FileReader("src/main/resources/departmentsOther.json"))) {
            List<Department> departments = gson.fromJson(reader, type);
            Assertions.assertEquals(departments.size(), 3);
            Assertions.assertEquals(2, Task6.calcNumberOfEmployees(departments, 30000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // maybe I shouldn't check JsonReader and FileReader
    // better make a mock-json as String
}