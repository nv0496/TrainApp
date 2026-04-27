package test;

import main.UseCase11TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    @Test
    public void testExtractColorCode() {
        // 1. Setup
        UseCase11TrainConsistMgmt uc11 = new UseCase11TrainConsistMgmt();

        // 2. Execute & Assert Valid Inputs
        // Standard valid input
        assertEquals("RED", uc11.extractColorCode("TRN-12345-RED"), "Should extract RED from valid ID.");

        // Different valid numbers and color
        assertEquals("BLUE", uc11.extractColorCode("TRN-99887-BLUE"), "Should extract BLUE from valid ID.");

        // 3. Execute & Assert Invalid Inputs
        // Wrong prefix (TRX instead of TRN)
        assertEquals("INVALID", uc11.extractColorCode("TRX-12345-RED"), "Should be INVALID due to wrong prefix.");

        // Too few digits (4 instead of 5)
        assertEquals("INVALID", uc11.extractColorCode("TRN-1234-RED"), "Should be INVALID due to incorrect digit count.");

        // Letters mixed into the digits
        assertEquals("INVALID", uc11.extractColorCode("TRN-12A45-RED"), "Should be INVALID because digits contain letters.");

        // Lowercase color code (Regex strictly looks for uppercase [A-Z])
        assertEquals("INVALID", uc11.extractColorCode("TRN-12345-red"), "Should be INVALID due to lowercase letters.");
    }
}