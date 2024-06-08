package medium.string_to_integer_atoi;

class Solution {
    public static int myAtoi(String s) {
        // Step 1: Trim leading and trailing whitespace
        s = s.trim();
        if (s.isEmpty()) {
            return 0; // Return 0 if the string is empty after trimming
        }

        // Step 2: Check for optional sign
        int sign = 1;
        int startIndex = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            startIndex++;
        } else if (s.charAt(0) == '+') {
            startIndex++;
        }

        // Step 3: Convert the string to an integer
        long result = 0;
        while (startIndex < s.length()) {
            char currentChar = s.charAt(startIndex);
            if (!Character.isDigit(currentChar)) {
                break; // Stop processing when a non-digit character is encountered
            }
            result = result * 10 + (currentChar - '0');
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE; // Clamp to 2^31 - 1
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE; // Clamp to -2^31
            }
            startIndex++;
        }

        return (int) (sign * result);
    }
}