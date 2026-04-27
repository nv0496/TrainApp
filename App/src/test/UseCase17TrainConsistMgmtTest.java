package test;

import main.UseCase17TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmtTest {

    @Test
    public void testSort_StandardArray() {
        UseCase17TrainConsistMgmt uc17 = new UseCase17TrainConsistMgmt();
        String[] arr = {"Sleeper", "AC Chair", "First Class", "Cargo"};
        String[] expected = {"AC Chair", "Cargo", "First Class", "Sleeper"}; // Alphabetical order

        uc17.sortBogieNames(arr);
        assertArrayEquals(expected, arr, "Should sort a standard mixed array alphabetically.");
    }

    @Test
    public void testSort_AlreadySortedArray() {
        UseCase17TrainConsistMgmt uc17 = new UseCase17TrainConsistMgmt();
        String[] arr = {"AC Chair", "Cargo", "First Class", "Sleeper"};
        String[] expected = {"AC Chair", "Cargo", "First Class", "Sleeper"};

        uc17.sortBogieNames(arr);
        assertArrayEquals(expected, arr, "Should leave an already sorted array unchanged.");
    }

    @Test
    public void testSort_ReverseSortedArray() {
        UseCase17TrainConsistMgmt uc17 = new UseCase17TrainConsistMgmt();
        String[] arr = {"Sleeper", "First Class", "Cargo", "AC Chair"};
        String[] expected = {"AC Chair", "Cargo", "First Class", "Sleeper"};

        uc17.sortBogieNames(arr);
        assertArrayEquals(expected, arr, "Should properly sort a completely reversed array.");
    }

    @Test
    public void testSort_EmptyArray() {
        UseCase17TrainConsistMgmt uc17 = new UseCase17TrainConsistMgmt();
        String[] arr = {};
        String[] expected = {};

        uc17.sortBogieNames(arr);
        assertArrayEquals(expected, arr, "Should gracefully handle an empty array.");
    }

    @Test
    public void testSort_NullInputHandling() {
        UseCase17TrainConsistMgmt uc17 = new UseCase17TrainConsistMgmt();
        String[] arr = null;

        // We use assertDoesNotThrow to prove our safety shield works!
        assertDoesNotThrow(() -> {
            uc17.sortBogieNames(arr);
        }, "Should gracefully handle a null array without throwing a NullPointerException.");

        assertNull(arr, "The array should safely remain null.");
    }
}