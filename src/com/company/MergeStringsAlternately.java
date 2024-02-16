package com.company;

import java.util.Arrays;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "pqr";
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        System.out.println(mergeAlternately(array1, array2));
    }

    private static String mergeAlternately(char[] array1, char[] array2) {
        int index = array1.length + array2.length;
        char[] newString = new char[index];

        if(array1.length == array2.length) {
            for (int i = 0, a = 0; i < array1.length; i++, a++) {
                newString[a] = array1[i];
                a++;
            }
            for (int i = 0, a = 1; i < array1.length; i++, a++) {
                newString[a] = array2[i];
                a++;
            }
        }
        if(array1.length < array2.length) {
            for (int i = 0, a = 1; i < array1.length; i++, a++) {
                newString[a] = array2[i];
                a++;
            }
        }

        if(array1.length > array2.length) {

        }


        return Arrays.toString(newString);
    }
}
