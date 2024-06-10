package easy.check_if_all_As_appears_before_all_Bs;

class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                foundB = true;
            } else if (foundB && c == 'a') {
                // If 'a' is found after 'b', return false
                return false;
            }
        }

        // If no 'a' is found after 'b', return true
        return true;
    }
}