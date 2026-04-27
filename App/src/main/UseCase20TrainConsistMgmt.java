package main;

public class UseCase20TrainConsistMgmt {

    /**
     * Searches for a Bogie ID and throws a custom exception if it is missing or if the inputs are invalid.
     */
    public int findBogieIndex(String[] bogieIds, String targetId) throws BogieNotFoundException {

        // Safety Shield 1: Check if the array itself is null
        if (bogieIds == null) {
            throw new BogieNotFoundException("Search Failed: The train consist array is null.");
        }

        // Safety Shield 2: Check if the search target is null
        if (targetId == null) {
            throw new BogieNotFoundException("Search Failed: The target Bogie ID cannot be null.");
        }

        // Standard Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (targetId.equals(bogieIds[i])) {
                return i; // Found it! Return the index.
            }
        }

        // If the loop finishes entirely, the bogie is missing. Trip the alarm!
        throw new BogieNotFoundException("Search Failed: Bogie ID '" + targetId + "' was not found in the consist.");
    }
}