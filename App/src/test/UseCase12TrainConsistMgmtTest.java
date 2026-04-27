package test;

import main.UseCase12TrainConsistMgmt;
import main.OverweightBogieException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    public void testCheckCargoWeight() {
        UseCase12TrainConsistMgmt uc12 = new UseCase12TrainConsistMgmt();

        // 1. Check an Overweight Bogie (Should throw our custom exception)
        // We use () -> { ... } which is a lambda expression telling JUnit to "try running this code"
        assertThrows(OverweightBogieException.class, () -> {

            // We pass 150 tons into a limit of 100 tons to intentionally trip the alarm
            uc12.checkCargoWeight(150, 100);

        }, "Should throw OverweightBogieException when weight exceeds limit.");

        // 2. Check a Safe Bogie (Should NOT throw an exception)
        assertDoesNotThrow(() -> {

            // We pass 80 tons into a limit of 100 tons. The alarm should stay silent.
            uc12.checkCargoWeight(80, 100);

        }, "Should not throw an exception for a safe weight.");
    }
}
