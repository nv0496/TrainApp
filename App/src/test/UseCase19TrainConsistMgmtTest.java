package test;

import main.UseCase19TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    @Test
    public void testBinarySearch_TargetFound() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103", "BOG-104", "BOG-105"}; // Must be sorted!

        int result = uc19.binarySearchBogieId(arr, "BOG-103");
        assertEquals(2, result, "Should find 'BOG-103' directly in the middle at index 2.");
    }

    @Test
    public void testBinarySearch_TargetNotFound() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc19.binarySearchBogieId(arr, "BOG-999");
        assertEquals(-1, result, "Should return -1 when the target is completely outside the array bounds.");
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {};

        int result = uc19.binarySearchBogieId(arr, "BOG-101");
        assertEquals(-1, result, "Should safely return -1 for an empty array.");
    }

    @Test
    public void testBinarySearch_FirstElement() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc19.binarySearchBogieId(arr, "BOG-101");
        assertEquals(0, result, "Should successfully find the target at the very first index (0).");
    }

    @Test
    public void testBinarySearch_LastElement() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc19.binarySearchBogieId(arr, "BOG-103");
        assertEquals(2, result, "Should successfully find the target at the very last index (2).");
    }

    @Test
    public void testBinarySearch_TargetBetweenElements() {
        UseCase19TrainConsistMgmt uc19 = new UseCase19TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-103", "BOG-105"};

        // BOG-102 alphabetically sits between 101 and 103, but it isn't in the array
        int result = uc19.binarySearchBogieId(arr, "BOG-102");
        assertEquals(-1, result, "Should return -1 for an item that is missing from the middle of the array.");
    }
}