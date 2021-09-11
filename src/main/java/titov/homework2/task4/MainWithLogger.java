package titov.homework2.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MainWithLogger {
    public static void main(String[] args) {
        // binding SLF4J to a SimpleLogger implementation (uses System.err)
        final Logger logger = LoggerFactory.getLogger("numbersLogger");
        ListGenerator listGenerator = new ListGenerator();
        List<Integer> generatedList;

        while (true) {
            // generate a list
            generatedList = listGenerator.generateList();
            try {
                // check if there are odd numbers
                OddsValidator.validateOdds(generatedList);
            } catch (EvenNumberException ene) {
                logger.trace("{}\n" +
                                "Odd number: {}\n" +
                                "Generated list: {}",
                        ene.getMessage(), ene.getOddNumber(), ene.getNumbersList());
                // start new iteration
                continue;
            }
            // stop cycle if exception wasn't caught
            break;
        }

        System.out.println("A list with odd numbers was generated: " + generatedList);
    }
}
