package com.company.validParentheses;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
        System.out.println(isValid_2(s));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            } else {
                if (deque.isEmpty())
                    return false;
                char top = deque.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

    public static boolean isValid_2(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            } else {
                if (deque.isEmpty() ||
                        (c == ')' && deque.peek() != '(') ||
                        (c == '}' && deque.peek() != '{') ||
                        (c == ']' && deque.peek() != '[')) {
                    return false;
                }
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
