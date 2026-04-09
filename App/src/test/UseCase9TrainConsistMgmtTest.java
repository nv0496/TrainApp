package test;

import main.UseCase9TrainConsistMgmt;
import main.UseCase9TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UseCase9TrainConsistMgmtTest {

    @Test
    public void testGroupBogiesByType() {
        // 1. Setup
        UseCase9TrainConsistMgmt uc9 = new UseCase9TrainConsistMgmt();

        // Create a test list with 2 Sleepers, 1 AC Chair, and 1 Cargo
        List<Bogie> consist = Arrays.asList(
                new Bogie("BOG-101", "Sleeper"),
                new Bogie("BOG-102", "AC Chair"),
                new Bogie("BOG-103", "Sleeper"),
                new Bogie("BOG-104", "Cargo")
        );

        // 2. Execute
        Map<String, List<String>> result = uc9.groupBogiesByType(consist);

        // 3. Assert
        // Verify that "Sleeper" is a key and it contains exactly 2 items
        assertTrue(result.containsKey("Sleeper"), "Map should contain 'Sleeper' category.");
        assertEquals(2, result.get("Sleeper").size(), "There should be exactly 2 Sleeper bogies.");

        // Verify the exact IDs got sorted correctly
        assertTrue(result.get("Sleeper").contains("BOG-101"));
        assertTrue(result.get("Sleeper").contains("BOG-103"));

        // Verify AC Chair and Cargo were also grouped correctly
        assertEquals(1, result.get("AC Chair").size());
        assertEquals("BOG-102", result.get("AC Chair").get(0));
    }
}