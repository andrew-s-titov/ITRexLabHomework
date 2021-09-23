package titov.homework4.concurrency1;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.IntStream;

public class MainTest {
    ByteArrayOutputStream output;

    @BeforeEach
    public void changeOutStream() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterAll
    public static void resetOutStream() {
        System.setOut(null);
    }

    @Test
    public void startThreadsABCD5() throws InterruptedException {
        int count = 50;
        LandRover landRover = new LandRover(count);
        Main.startThreadsABCD(landRover);
        Thread.sleep(1000);
        System.out.flush();

        Assertions.assertEquals(generateResult(count), output.toString());
    }

    private String generateResult(int landRoverParam) {
        final StringBuilder strBuilder = new StringBuilder();
        IntStream.rangeClosed(1, landRoverParam).forEachOrdered(n -> strBuilder.append(print(n)));
        return strBuilder.toString();
    }

    private String print(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        // CR / LF / CRLF depends on the system
        String separator = System.getProperty("line.separator");

        if (divisibleBy3 && !divisibleBy5) {
            return "Land" + separator;
        }
        if (!divisibleBy3 && divisibleBy5) {
            return "Rover" + separator;
        }
        if (divisibleBy3 && divisibleBy5) {
            return "LandRover" + separator;
        }
        if (!divisibleBy3 && !divisibleBy5) {
            return number + separator;
        }
        return "";
    }
}