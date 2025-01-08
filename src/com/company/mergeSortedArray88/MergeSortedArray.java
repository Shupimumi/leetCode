package com.company.mergeSortedArray88;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args){
     int[] nums1 = new int[] {1, 2 ,3 , 0, 0 ,0};
     int[] nums2 = new int[] {2, 5, 3};
     int m = 3;
     int n = 3;

     merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m; i++){
            nums1[i] = nums1[i];
        }

        for (int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            for(int j = 0; j < nums1.length - i - 1; j++) {
                if(nums1[j + 1] < nums1[j]) {
                    int swap = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
