package main;

public class UseCase18TrainConsistMgmt {

    /**
     * Performs a linear search to find a specific Bogie ID in an array.
     * Returns the exact index if found, or -1 if not found.
     */
    public int searchBogieId(String[] bogieIds, String targetId) {

        // Safety Shield: Handle null arrays gracefully to prevent crashes
        if (bogieIds == null) {
            return -1;
        }

        // Linear Search: Check every element one by one from left to right
        for (int i = 0; i < bogieIds.length; i++) {

            // If the current element matches our target, stop looking and return the index!
            if (bogieIds[i].equals(targetId)) {
                return i;
            }
        }

        // If the loop finishes entirely, the target was not in the array
        return -1;
    }
}