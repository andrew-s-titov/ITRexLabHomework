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

public class Task7Test {
    Gson gson = new Gson();
    Type type = new TypeToken<List<Account>>(){}.getType();

    @Test
    public void calcSumOfCanceledTransOnNonEmptyAccounts() {
        try (JsonReader reader = new JsonReader(new FileReader("src/main/resources/accounts.json"))) {
            List<Account> accounts = gson.fromJson(reader, type);
            Assertions.assertEquals(accounts.size(), 2);
            Assertions.assertEquals(10000, Task7.calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // maybe I shouldn't check JsonReader and FileReader
    // better make a mock-json as String
}