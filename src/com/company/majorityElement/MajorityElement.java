package com.company.majorityElement;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        System.out.println(majorityElement(nums));
        System.out.println(bestSolution(nums));
    }


    public static int majorityElement(int[] nums) {
        int counter = 0;
        int equal = nums.length / 2;
        int result = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length & counter <= equal; i++) {
            counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    counter++;
            }
            result = nums[i];
        }

        return result;
    }

    public static int bestSolution(int[] nums) {
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }

        return res;
    }
}
