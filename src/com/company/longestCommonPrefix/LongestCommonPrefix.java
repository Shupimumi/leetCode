package com.company.longestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(bestSolution(strs));
    }

    /// My solution
    public static String longestCommonPrefix(String[] strs) {
        String shortestString = strs[0];

        for (String str : strs) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }

        if (shortestString.length() == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String subString = "";
        String test = strs[0];

        if (shortestString.length() < 2) {
            for (int i = 1; i < strs.length; i++) {
                if (test.substring(0, 1).equals(strs[i].substring(0, 1))) {
                    subString = test.substring(0, 1);
                } else {
                    subString = "";
                    break;
                }
            }
            return subString;
        } else {
            outerLoop:
            for (int k = 1; k <= shortestString.length(); k++) {
                for (int i = 1; i < strs.length; i++) {
                    if (test.substring(0, k).equals(strs[i].substring(0, k))) {
                        subString = test.substring(0, k);
                    } else {
                        if (k == 1) {
                            break outerLoop;
                        } else {
                            subString = test.substring(0, k - 1);
                            break outerLoop;
                        }
                    }
                }
            }
            return subString;
        }
    }

    /// Best runtime solution
    public static String bestSolution(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
