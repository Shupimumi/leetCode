package com.company.lengthOfLastWord;

public class LengthOfLastWord {


    ///  TODO: Need to do a solvation without regex. Also need to do the best.
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input));
        System.out.println(myFunction(input));
    }

    public static int lengthOfLastWord(String s) {
        String result = s.trim().replaceAll(".*\\b(\\w+)\\b\\s*$", "$1");
        System.out.println(result);

        return result.length();
    }

    public static int myFunction(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }

        return length;
    }
}
