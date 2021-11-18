package DSA_Bootcamp.arrays_solution;

import java.util.Arrays;

public class problem1 {
    //    Build Array from Permutation(https://leetcode.com/problems/build-array-from-permutation/)
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
