package titov.homework2.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    private final int listSize;
    private final int minNumber;
    private final int maxNumber;

    private final int DEFAULT_LIST_SIZE = 3;
    private final int DEFAULT_MIN_NUMBER = 1;
    private final int DEFAULT_MAX_NUMBER = 9;

    ListGenerator() {
        this.listSize = DEFAULT_LIST_SIZE;
        this.minNumber = DEFAULT_MIN_NUMBER;
        this.maxNumber = DEFAULT_MAX_NUMBER;
    }

    /**
     * @param listSize  size of a generated list. Must be bigger than 1.
     * @param minNumber inclusive. Can't be less than 0.
     * @param maxNumber exclusive. Must be bigger than minNumber.
     */
    ListGenerator(int listSize, int minNumber, int maxNumber) {
        if (listSize < 1) {
            throw new IllegalArgumentException("Size of a generated list can't be less than 1!");
        }
        if (minNumber < 0 || minNumber > maxNumber) {
            throw new IllegalArgumentException("minNumber must be bigger than 0 and can't be bigger than maxNumber!");
        }
        this.listSize = listSize;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add(new Random().nextInt(maxNumber + 1 - minNumber) + minNumber);
        }
        return list;
    }
}
