package easy.check_if_all_As_appears_before_all_Bs;

class Solution {
    public boolean checkString(String s) {
        boolean response = true;
        boolean foundB = false;
        int i=0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                i++;
            } else if (c == 'b') {
                foundB = true;
                i++;
                break;
            }
        }

        if (!foundB) {
            return response;
        } else {
            for (char c : s.substring(i).toCharArray()) {
                if (c != 'b') {
                    response = false;
                    break;
                }
            }
            return response;
        }
    }
}