package com.company.ipo502;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Ipo {

    public static void main(String[] args) {
        int k = 2;
        int w = 0;
        int[] profits = new int[]{1, 2, 3};
        int[] capital = new int[]{0, 1, 1};

        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<Integer> indexes = new ArrayList<>();

        Stream<Integer> test;
        for (int i = 0; i < capital.length; i++) {
            if (w >= capital[i]) {
                indexes.add(i);
            }
        }

        for (int index : indexes){

        }
        return 0;

    }
}
