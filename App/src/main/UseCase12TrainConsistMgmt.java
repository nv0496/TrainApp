package main;

public class UseCase12TrainConsistMgmt {

    /**
     * Checks if a cargo bogie is within safe weight limits.
     * The "throws" keyword warns anyone using this method that it might trigger our custom alarm.
     */
    public void checkCargoWeight(int currentWeight, int maxLimit) throws OverweightBogieException {

        if (currentWeight > maxLimit) {
            // Trigger our custom alarm with a specific message!
            throw new OverweightBogieException("SAFETY ALERT: Cargo weight (" + currentWeight + "t) exceeds the safe limit of " + maxLimit + "t!");
        }

        // If the code makes it here, it means the if-statement didn't trigger, so it's safe.
        System.out.println("Cargo check passed: " + currentWeight + "t is safely under the " + maxLimit + "t limit.");
    }
}