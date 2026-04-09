package test;

import main.UseCase8TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseCase8TrainConsistMgmtTest {

    @Test
    public void testFilterPassengerBogies() {
        // 1. Setup: Create an instance of the class we want to test
        UseCase8TrainConsistMgmt uc8 = new UseCase8TrainConsistMgmt();

        // Create a mixed consist list (must use ArrayList so it is mutable/changeable)
        List<String> inputConsist = new ArrayList<>(Arrays.asList(
                "Engine", "Sleeper", "Cargo", "AC Chair", "First Class", "Pantry Car"
        ));

        // 2. Execute: Run the method
        List<String> result = uc8.filterPassengerBogies(inputConsist);

        // 3. Assert: Verify the results
        List<String> expected = Arrays.asList("Sleeper", "AC Chair", "First Class");

        // Check if the resulting list matches our expected list exactly
        assertEquals(expected, result, "The list should only contain passenger bogies.");

        // Double-check the size is exactly 3
        assertEquals(3, result.size(), "The size of the filtered list should be 3.");
    }
}