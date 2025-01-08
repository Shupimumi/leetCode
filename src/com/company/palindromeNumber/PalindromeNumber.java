package com.company.palindromeNumber;

import java.util.ArrayList;

/**
 * Given an integer num, return true if num is a palindrome, and false otherwise.
 **/

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }


    public static boolean isPalindrome(int num) {
        boolean isPalindrome = false;

        if (num < 0) {
            return isPalindrome;
        } else {
            ArrayList<Integer> array = new ArrayList<>();
            do {
                array.add(num % 10);
                num /= 10;
            } while (num > 0);


            if (array.size() % 2 == 0) {
                for (int i = 0; i < array.size() / 2; i++) {
                    int firstNum = array.get(i);
                    int secondNum = array.get(array.size() - (i + 1));
                    if (firstNum == secondNum) {
                        isPalindrome = true;
                    }
                    if (firstNum != secondNum) {
                        isPalindrome = false;
                        break;
                    }
                }
            }

            if (array.size() % 2 != 0) {
                for (int i = 0; i < (array.size() - 1) / 2; i++) {
                    int firstNum = array.get(i);
                    int secondNum = array.get(array.size() - (i + 1));
                    if (firstNum == secondNum) {
                        isPalindrome = true;
                    }
                    if (firstNum != secondNum) {
                        isPalindrome = false;
                        break;
                    }
                }
            }

            if (array.size() == 1) {
                isPalindrome = true;
            }
            return isPalindrome;
        }
    }
}
