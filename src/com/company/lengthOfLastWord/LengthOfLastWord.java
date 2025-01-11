package com.company.lengthOfLastWord;

public class LengthOfLastWord {


    ///  TODO: Need to do a solvation without regex. Also need to do the best.
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        String result = s.trim().replaceAll(".*\\b(\\w+)\\b\\s*$", "$1");
        System.out.println(result);

        return result.length();
    }
}
