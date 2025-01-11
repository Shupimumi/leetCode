package com.company.majorityElement;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int test = majorityElement(nums);
        System.out.println(test);
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
}
