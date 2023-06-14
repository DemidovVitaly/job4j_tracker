package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.*;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        sort(list);
        System.out.println(list);

        Integer first = 1;
        Integer second = 5;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);

        List<Integer> list2 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list2);
        list2.sort(reverseOrder());
        System.out.println(list2);
    }
}