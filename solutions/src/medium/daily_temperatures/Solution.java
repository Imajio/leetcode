package medium.daily_temperatures;

//Stack O(n^2) not leetcode solution
//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int[] awr = new int[temperatures.length];
//        for (int i = temperatures.length-1; i >= 0; i--) {
//            for (int j = i-1; j >= 0; j--) {
//                if (temperatures[i] > temperatures[j]) {
//                    awr[j] = j - i-1;
//                    break;
//                }
//            }
//        }
//        awr[temperatures.length-1] = 0;
//        return awr;
//    }
//}


//Dinamic Programming O(n)

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (res[j] == 0) {
                    j = n;
                    break;
                }
                j += res[j];
            }

            if (j < n) {
                res[i] = j - i;
            }
        }
        return res;
    }
}
