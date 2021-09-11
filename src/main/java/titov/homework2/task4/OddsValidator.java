package titov.homework2.task4;

import java.util.List;

public class OddsValidator {
    public static void validateOdds(List<Integer> numbersList) throws EvenNumberException {
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                throw new EvenNumberException("There's an odd number in the list.", numbersList, integer);
            }
        }
    }
}