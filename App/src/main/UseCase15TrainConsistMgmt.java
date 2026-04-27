package main;

public class UseCase15TrainConsistMgmt {

    /**
     * Assigns a cargo ID to the first available (null) slot in a 2D cargo bay grid.
     * Returns true if successfully assigned, or false if the bay is completely full.
     */
    public boolean assignCargo(String[][] cargoBay, String cargoId) {

        // Loop through the rows (top to bottom)
        for (int i = 0; i < cargoBay.length; i++) {

            // Loop through the columns in the current row (left to right)
            for (int j = 0; j < cargoBay[i].length; j++) {

                // If we find an empty slot, put the cargo there!
                if (cargoBay[i][j] == null) {
                    cargoBay[i][j] = cargoId;
                    System.out.println("Success: Cargo " + cargoId + " assigned to bay [" + i + "][" + j + "]");
                    return true;
                }
            }
        }

        // If the loops finish and we never returned true, the bay must be full
        System.out.println("Alert: Cargo Bay is full. Cannot assign " + cargoId);
        return false;
    }
}