package DSA_Bootcamp.arrays_solution;

import java.util.Arrays;

public class problem3 {
    //    Running Sum of 1d Array(https://leetcode.com/problems/running-sum-of-1d-array/)
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i-1];
        }
        return sum;
    }
}
