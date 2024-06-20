package easy.concatenation_of_array;

import java.util.Arrays;

class Solution {
    public int[] getConcatenation1(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    public int[] getConcatenation2(int[] nums) {
        int[] ans= Arrays.copyOf(nums,2*nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans;

    }
}