package com.company.twoSum;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 **/

public class TwoSumClass {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int n = i;
            while (n < nums.length - 1) {
                if (nums[i] + nums[n + 1] == target) {
                    result[0] = i;
                    result[1] = n + 1;
                }
                n++;
            }
        }
        return result;
    }
}
