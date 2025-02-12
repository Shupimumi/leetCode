package com.company.validPalindrome;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) {
        String s = str.chars()
                .parallel()
                .filter(Character::isLetterOrDigit)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .toLowerCase();
        boolean status = true;
        for (int i = 0, k = s.length() - 1; i < k; i++, k--) {
            if (s.charAt(i) != s.charAt(k)) {
                return false;
            }
        }
        return status;
    }
}
