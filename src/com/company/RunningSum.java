package com.company;

public class RunningSum {

    public static void main(String[] args) {
        int[] array = {5, 1, 8, 9, 11};
        int[] newArray = returnSumOfArray(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    private static int[] returnSumOfArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                newArray[i] = array[i];
            } else {
                newArray[i] = newArray[i - 1] + array[i];
            }
        }
        return newArray;
    }

}
