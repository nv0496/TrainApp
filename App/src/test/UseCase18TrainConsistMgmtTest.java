package test;

import main.UseCase18TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmtTest {

    @Test
    public void testSearch_TargetExists() {
        UseCase18TrainConsistMgmt uc18 = new UseCase18TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103", "BOG-104"};

        int result = uc18.searchBogieId(arr, "BOG-103");
        assertEquals(2, result, "Should find 'BOG-103' at index 2.");
    }

    @Test
    public void testSearch_TargetNotFound() {
        UseCase18TrainConsistMgmt uc18 = new UseCase18TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc18.searchBogieId(arr, "BOG-999");
        assertEquals(-1, result, "Should return -1 when the target does not exist.");
    }

    @Test
    public void testSearch_EmptyArray() {
        UseCase18TrainConsistMgmt uc18 = new UseCase18TrainConsistMgmt();
        String[] arr = {};

        int result = uc18.searchBogieId(arr, "BOG-101");
        assertEquals(-1, result, "Should return -1 for an empty array.");
    }

    @Test
    public void testSearch_FirstElement() {
        UseCase18TrainConsistMgmt uc18 = new UseCase18TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc18.searchBogieId(arr, "BOG-101");
        assertEquals(0, result, "Should find the target at the very first index (0).");
    }

    @Test
    public void testSearch_LastElement() {
        UseCase18TrainConsistMgmt uc18 = new UseCase18TrainConsistMgmt();
        String[] arr = {"BOG-101", "BOG-102", "BOG-103"};

        int result = uc18.searchBogieId(arr, "BOG-103");
        assertEquals(2, result, "Should find the target at the very last index (2).");
    }
}