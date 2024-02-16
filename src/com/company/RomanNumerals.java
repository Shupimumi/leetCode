package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static void main(String[] args) {

        String s = "MMCMIX";
        System.out.println(returnSolution(s));

    }

    static int returnSolution(String s) {
        Map<Character, Integer> romanDictionary = new HashMap<>();

        {
            romanDictionary.put('I', 1);
            romanDictionary.put('V', 5);
            romanDictionary.put('X', 10);
            romanDictionary.put('L', 50);
            romanDictionary.put('C', 100);
            romanDictionary.put('D', 500);
            romanDictionary.put('M', 1000);
        }
        char[] array = s.toCharArray();
        int test = array.length;
        int sum = 0;
        int number;
        for (int counter = 0; counter < test; counter++) {
            if (test == 1) {
                number = romanDictionary.get(array[counter]);
                sum = sum + number;
                break;
            }
            if (counter == 0) {
                if (romanDictionary.get(array[counter]) < romanDictionary.get(array[counter + 1])) {
                    number = romanDictionary.get(array[counter + 1]) - romanDictionary.get(array[counter]);
                    sum = sum + number;
                    counter++;
                    continue;
                }
                if (romanDictionary.get(array[counter]) >= romanDictionary.get(array[counter + 1])) {
                    number = romanDictionary.get(array[counter]);
                    sum = sum + number;
                }
            }
            if ((counter < (test - 1)) && (counter > 0)) {
                if (romanDictionary.get(array[counter]) < romanDictionary.get(array[counter + 1])) {
                    number = romanDictionary.get(array[counter + 1]) - romanDictionary.get(array[counter]);
                    sum = sum + number;
                    counter++;
                    continue;
                }
                if (romanDictionary.get(array[counter]) >= romanDictionary.get(array[counter + 1])) {
                    number = romanDictionary.get(array[counter]);
                    sum = sum + number;
                }
            }
            if (counter == (test - 1)) {
                number = romanDictionary.get(array[counter]);
                sum = sum + number;
            }
        }
        return sum;
    }
}
