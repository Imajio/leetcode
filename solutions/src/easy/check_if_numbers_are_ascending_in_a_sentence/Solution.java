package easy.check_if_numbers_are_ascending_in_a_sentence;

public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        // Initialize to a value less than any possible number in the string
        int previousNumber = -1;

        for (String token : tokens) {
            if (isNumeric(token)) {
                int currentNumber = Integer.parseInt(token);
                if (currentNumber <= previousNumber) {
                    // If the current number is not greater than the previous one, return false
                    return false;
                }
                // Update the previous number to the current one
                previousNumber = currentNumber;
            }
        }

        // If all numbers are strictly increasing, return true
        return true;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
