package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    /**
     * Validates the train ID format using Regex and extracts the color code.
     * Expected format: TRN-[5 digits]-[COLOR]
     * If valid, returns the color. If invalid, returns "INVALID".
     */
    public String extractColorCode(String trainId) {
        // Define the Regex pattern
        // ^TRN-       : Must start with "TRN-"
        // \\d{5}-     : Must have exactly 5 digits, followed by a "-"
        // ([A-Z]+)$   : Must end with 1 or more uppercase letters.
        //               The parentheses () create a "Group" so we can extract just the color later!
        String regex = "^TRN-\\d{5}-([A-Z]+)$";

        // Compile the pattern and create a matcher for our input
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainId);

        // Check if the input exactly matches our pattern
        if (matcher.matches()) {
            // Group(1) refers to the part of the regex inside the parentheses: ([A-Z]+)
            return matcher.group(1);
        } else {
            return "INVALID";
        }
    }
}