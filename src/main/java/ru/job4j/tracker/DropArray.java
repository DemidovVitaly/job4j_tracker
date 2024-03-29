package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan555", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }

        String[] names2 = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names2, 2, names2, 1, 3);
        System.out.println(Arrays.toString(names2));
    }
}