package com.company;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] nums3 = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int j = nums1.length; j - nums1.length < nums2.length; j++) {
            nums3[j] = nums2[j - nums1.length];
        }

        for (int left = 0; left < nums3.length; left++) {
            int minInd = left;
            for (int i = left; i < nums3.length; i++) {
                if (nums3[i] < nums3[minInd]) {
                    minInd = i;
                }
            }
            swap(nums3, left, minInd);
        }

        int[] nums4 = middleArray(nums3);
        if(nums4.length % 2 == 0){

            median = (nums4[0] + nums4[1]) / 2.0;
        }else{
            median = nums4[0];
        }

        return median;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static int[] middleArray(int[] array) {
        int left = (array.length - 1) / 2;
        int right = array.length == 0 ? 0 : left + 2 - array.length % 2;
        return Arrays.copyOfRange(array, left, right);
    }
}


