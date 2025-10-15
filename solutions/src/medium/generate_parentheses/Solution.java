package medium.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.generateParenthesis(3));
//    }
    public List<String> generateParenthesis(int n) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(new ArrayList<>());
        }
        res.getFirst().add("");

        for (int k = 0; k <= n; k++) {
            for (int i = 0; i < k; i++) {
                for (String left : res.get(i)) {
                    for (String right : res.get(k - i - 1)) {
                        res.get(k).add("(" + left + ")" + right);
                    }
                }
            }
        }

        return res.get(n);
    }
}
