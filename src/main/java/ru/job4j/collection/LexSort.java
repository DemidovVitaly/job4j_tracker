package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       /*
       int rsl = 0;
        String[] leftString = left.split("\\.", 3);
        String[] rightString = right.split("\\.", 3);
        for (int i = 0; i < Math.min(leftString.length, rightString.length); i++) {
            rsl = Integer.compare(Integer.parseInt(leftString[i]), Integer.parseInt(rightString[i]));
            if (rsl != 0) {
                return rsl;
            }
        }
        return rsl;
        */
        int leftNumber = Integer.parseInt(left.split("\\.", 2)[0]);
        int rightNumber = Integer.parseInt(right.split("\\.", 2)[0]);
        return Integer.compare(leftNumber, rightNumber);

    }
}