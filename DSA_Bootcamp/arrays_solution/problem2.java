package DSA_Bootcamp.arrays_solution;

import java.util.Arrays;

public class problem2 {
    //    Concatenation of Array(https://leetcode.com/problems/concatenation-of-array/)
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) ans[i] = nums[i];
            else ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}
