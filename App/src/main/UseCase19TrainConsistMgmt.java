package main;

public class UseCase19TrainConsistMgmt {

    /**
     * Performs an optimized Binary Search to find a specific Bogie ID.
     * Prerequisite: The array of sortedIds MUST be sorted alphabetically!
     * Returns the exact index if found, or -1 if not found.
     */
    public int binarySearchBogieId(String[] sortedIds, String targetId) {

        // Safety Shield: Handle null arrays gracefully
        if (sortedIds == null || sortedIds.length == 0) {
            return -1;
        }

        int left = 0;
        int right = sortedIds.length - 1;

        // Keep searching as long as the left pointer hasn't passed the right pointer
        while (left <= right) {
            // Find the exact middle of our current search window
            int mid = left + (right - left) / 2;

            // Compare the middle item with our target
            int comparison = targetId.compareTo(sortedIds[mid]);

            if (comparison == 0) {
                // We found an exact match!
                return mid;
            } else if (comparison < 0) {
                // Target comes BEFORE the middle item alphabetically, so chop off the right half
                right = mid - 1;
            } else {
                // Target comes AFTER the middle item alphabetically, so chop off the left half
                left = mid + 1;
            }
        }

        // If the loop finishes and the pointers cross, the item doesn't exist
        return -1;
    }
}