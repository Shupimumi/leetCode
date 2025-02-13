package com.company.excelSheetColumnTitle;

public class Solution {
    public static void main(String[] args) {
        int column = 707;
        System.out.println(convertToTitle(column));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + columnNumber % 26);
            result.insert(0, ch);
            columnNumber /= 26;
        }
        return result.toString();
    }
}
