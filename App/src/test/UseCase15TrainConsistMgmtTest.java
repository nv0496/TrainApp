package test;

import main.UseCase15TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    @Test
    public void testAssignCargoToEmptySlot() {
        UseCase15TrainConsistMgmt uc15 = new UseCase15TrainConsistMgmt();

        // Create an empty 3x3 grid (all slots default to null)
        String[][] cargoBay = new String[3][3];

        boolean result = uc15.assignCargo(cargoBay, "C-101");

        assertTrue(result, "Should return true when assigning to an empty bay.");
        assertEquals("C-101", cargoBay[0][0], "Cargo should be assigned to the very first slot [0][0].");
    }

    @Test
    public void testAssignCargoToPartiallyFilledBay() {
        UseCase15TrainConsistMgmt uc15 = new UseCase15TrainConsistMgmt();

        // Create a grid and manually fill the first two slots
        String[][] cargoBay = new String[3][3];
        cargoBay[0][0] = "C-101";
        cargoBay[0][1] = "C-102";

        boolean result = uc15.assignCargo(cargoBay, "C-103");

        assertTrue(result, "Should return true when assigning to a partially filled bay.");
        assertEquals("C-103", cargoBay[0][2], "Cargo should be assigned to the next available slot [0][2].");
    }

    @Test
    public void testAssignCargoToFullBay() {
        UseCase15TrainConsistMgmt uc15 = new UseCase15TrainConsistMgmt();

        // Create a grid that is completely pre-filled
        String[][] cargoBay = {
                {"C-1", "C-2", "C-3"},
                {"C-4", "C-5", "C-6"},
                {"C-7", "C-8", "C-9"}
        };

        boolean result = uc15.assignCargo(cargoBay, "C-999");

        assertFalse(result, "Should return false when assigning to a completely full bay.");
    }
}