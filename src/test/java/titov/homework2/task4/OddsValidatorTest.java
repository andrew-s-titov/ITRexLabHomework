package titov.homework2.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class OddsValidatorTest {
    private final List<Integer> nums1 = Arrays.asList(2, 1, 5);
    private final List<Integer> nums2 = Arrays.asList(3, 2, 9);
    private final List<Integer> nums3 = Arrays.asList(1, 7, 2);
    private final List<Integer> nums4 = Arrays.asList(2, 6, 8);
    private final List<Integer> nums5 = Arrays.asList(5, 2, 4);
    private final List<Integer> nums6 = Arrays.asList(5, 9, 2);

    @Test
    public void checkValidationThrows() {
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums1));
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums2));
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums3));
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums4));
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums5));
        Assertions.assertThrows(EvenNumberException.class, () -> OddsValidator.validateOdds(nums6));
    }
}