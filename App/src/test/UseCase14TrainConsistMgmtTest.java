package test;

import main.UseCase14TrainConsistMgmt;
import main.InvalidBogieCapacityException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    public void testValidateBogieCapacity() {
        UseCase14TrainConsistMgmt uc14 = new UseCase14TrainConsistMgmt();

        // 1. Check an Invalid Capacity (Negative number should throw exception)
        assertThrows(InvalidBogieCapacityException.class, () -> {

            // Intentionally passing -15 to trigger the alarm
            uc14.validateBogieCapacity(-15);

        }, "Should throw InvalidBogieCapacityException when capacity is negative.");

        // 2. Check a Valid Capacity (Positive number should NOT throw exception)
        assertDoesNotThrow(() -> {

            // Passing a normal 72-seat sleeper bogie
            uc14.validateBogieCapacity(72);

        }, "Should not throw any exception for a valid positive capacity.");
    }
}