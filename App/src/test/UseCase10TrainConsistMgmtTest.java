package test;

import main.UseCase10TrainConsistMgmt;
import main.UseCase10TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class UseCase10TrainConsistMgmtTest {

    @Test
    public void testCountTotalSeats() {
        // 1. Setup
        UseCase10TrainConsistMgmt uc10 = new UseCase10TrainConsistMgmt();

        // Create a list of Bogies with known seat capacities
        List<Bogie> consist = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54),
                new Bogie("First Class", 24),
                new Bogie("Cargo", 0) // Cargo has no seats!
        );

        // 2. Execute
        int totalSeats = uc10.countTotalSeats(consist);

        // 3. Assert
        // We expect: 72 + 54 + 24 + 0 = 150
        assertEquals(150, totalSeats, "The total seat count should correctly sum to 150.");
    }
}