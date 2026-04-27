package test;

import main.UseCase13TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class UseCase13TrainConsistMgmtTest {

    @Test
    public void testPerformanceComparison() {
        UseCase13TrainConsistMgmt uc13 = new UseCase13TrainConsistMgmt();

        // 1. Setup: Generate 1,000,000 bogies!
        int size = 1000000;
        List<String> largeConsist = uc13.generateLargeConsist(size);

        // Make sure it actually built the whole list
        assertEquals(size, largeConsist.size(), "List should contain exactly 1,000,000 items.");

        // 2. Execute: Measure both approaches
        long forLoopTime = uc13.measureForLoopPerformance(largeConsist);
        long streamTime = uc13.measureStreamPerformance(largeConsist);

        // Print results to the console so you can see the race results
        System.out.println("=========================================");
        System.out.println("--- UC13: Performance Comparison ---");
        System.out.println("Processing " + size + " items...");
        System.out.println("For-Loop Time : " + forLoopTime + " ns");
        System.out.println("Stream Time   : " + streamTime + " ns");
        System.out.println("=========================================");

        // 3. Assert: Just make sure the methods ran and returned a time
        assertTrue(forLoopTime > 0, "For-loop should take some amount of time.");
        assertTrue(streamTime > 0, "Stream should take some amount of time.");
    }
}