package test;

import main.UseCase16TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    @Test
    public void testSort_StandardArray() {
        UseCase16TrainConsistMgmt uc16 = new UseCase16TrainConsistMgmt();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        uc16.sortCapacities(arr);
        assertArrayEquals(expected, arr, "Should sort a standard mixed array.");
    }

    @Test
    public void testSort_AlreadySortedArray() {
        UseCase16TrainConsistMgmt uc16 = new UseCase16TrainConsistMgmt();
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        uc16.sortCapacities(arr);
        assertArrayEquals(expected, arr, "Should leave an already sorted array unchanged.");
    }

    @Test
    public void testSort_ReverseSortedArray() {
        UseCase16TrainConsistMgmt uc16 = new UseCase16TrainConsistMgmt();
        int[] arr = {90, 64, 34, 25, 22, 12, 11};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        uc16.sortCapacities(arr);
        assertArrayEquals(expected, arr, "Should properly sort a completely reversed array.");
    }

    @Test
    public void testSort_DuplicatesArray() {
        UseCase16TrainConsistMgmt uc16 = new UseCase16TrainConsistMgmt();
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 11, 25};
        int[] expected = {11, 11, 12, 22, 25, 25, 34, 64, 90};

        uc16.sortCapacities(arr);
        assertArrayEquals(expected, arr, "Should handle and sort arrays containing duplicate numbers.");
    }

    @Test
    public void testSort_EmptyArray() {
        UseCase16TrainConsistMgmt uc16 = new UseCase16TrainConsistMgmt();
        int[] arr = {};
        int[] expected = {};

        uc16.sortCapacities(arr);
        assertArrayEquals(expected, arr, "Should gracefully handle an empty array without crashing.");
    }
}