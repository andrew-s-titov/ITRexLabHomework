package titov.homework3.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3FunctionalTest {
    @Test
    public void testCommonRequestHandler() {
        String testString = "We'd like to buy an elephant";
        Task3.Request request = new Task3.Request(testString);

        String expectedStart = "<request><transaction>" + testString + "</transaction><digest>";
        String expectedEnd = "</digest></request>";

        String result = Task3.commonRequestHandler.handle(request).getData();

        Assertions.assertTrue(result.startsWith(expectedStart));
        Assertions.assertTrue(result.endsWith(expectedEnd));
    }
}