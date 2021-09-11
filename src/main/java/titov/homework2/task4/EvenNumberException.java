package titov.homework2.task4;

import java.util.List;

public class EvenNumberException extends Exception {
    private final List<Integer> numbersList;
    private final int oddNumber;

    public EvenNumberException(String message, List<Integer> generatedList, int oddNumber) {
        super(message);
        this.numbersList = generatedList;
        this.oddNumber = oddNumber;
    }

    public List<Integer> getNumbersList() {
        return numbersList;
    }

    public int getOddNumber() {
        return oddNumber;
    }
}
