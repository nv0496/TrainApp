package test;

import main.UseCase20TrainConsistMgmt;
import main.BogieNotFoundException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    @Test
    public void testSearch_TargetFound() {
        UseCase20TrainConsistMgmt uc20 = new UseCase20TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        // assertDoesNotThrow ensures a valid search doesn't accidentally trip our alarm
        assertDoesNotThrow(() -> {
            int result = uc20.findBogieIndex(arr, "BOG-102");
            assertEquals(1, result, "Should successfully find 'BOG-102' at index 1.");
        });
    }

    @Test
    public void testSearch_TargetNotFound_ThrowsException() {
        UseCase20TrainConsistMgmt uc20 = new UseCase20TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        assertThrows(BogieNotFoundException.class, () -> {
            uc20.findBogieIndex(arr, "BOG-999");
        }, "Should throw BogieNotFoundException when the target is completely missing.");
    }

    @Test
    public void testSearch_NullTarget_ThrowsException() {
        UseCase20TrainConsistMgmt uc20 = new UseCase20TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102"};

        assertThrows(BogieNotFoundException.class, () -> {
            uc20.findBogieIndex(arr, null);
        }, "Should throw BogieNotFoundException if the search target is null.");
    }

    @Test
    public void testSearch_EmptyArray_ThrowsException() {
        UseCase20TrainConsistMgmt uc20 = new UseCase20TrainConsistMgmt();
        String[] arr = {}; // Empty array

        assertThrows(BogieNotFoundException.class, () -> {
            uc20.findBogieIndex(arr, "BOG-101");
        }, "Should throw BogieNotFoundException if searching inside an empty array.");
    }

    @Test
    public void testSearch_NullArray_ThrowsException() {
        UseCase20TrainConsistMgmt uc20 = new UseCase20TrainConsistMgmt();
        String[] arr = null; // Null array

        assertThrows(BogieNotFoundException.class, () -> {
            uc20.findBogieIndex(arr, "BOG-101");
        }, "Should throw BogieNotFoundException if the array itself is null.");
    }
}