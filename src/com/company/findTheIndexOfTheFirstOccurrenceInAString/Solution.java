package com.company.findTheIndexOfTheFirstOccurrenceInAString;

public class Solution {

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j < haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle))
                return i;
        }
        return -1;
    }
}

