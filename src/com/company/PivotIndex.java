package com.company;

public class PivotIndex {
    public static void main(String[] args) {

        int[] nums = {2,1,-1};
        int index = pivotIndex(nums);
        System.out.println(index);

    }

    static int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0, index = 0;

        mainLoop:
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                for (int b = i + 1; b < nums.length; b++) {
                    rightSum = rightSum + nums[b];
                }
                if (rightSum == leftSum) {
                    index = i;
                    break mainLoop;
                } else {
                    index = -1;
                }
            }
            if (i > 0 && i < nums.length - 1) {
                rightSum = 0;
                leftSum = 0;
                for (int b = i + 1; b < nums.length; b++) {
                    rightSum = rightSum + nums[b];
                }
                for (int c = i - 1; c >= 0; c--) {
                    leftSum = leftSum + nums[c];
                }
                if (leftSum == rightSum) {
                    index = i;
                    break mainLoop;
                } else {
                    index = -1;
                }
            }

            if (i == nums.length - 1) {
                rightSum = 0;
                leftSum = 0;
                for (int b = i - 1; b >= 0; b--) {
                    leftSum = leftSum + nums[b];
                }
                if (rightSum == leftSum) {
                    index = i;
                    break mainLoop;
                } else {
                    index = -1;
                }
            }
        }
        return index;
    }
}
