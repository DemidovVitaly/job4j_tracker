package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /* добавление заявок */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /*получение списка всех заявок*/
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /* получение списка по имени */
    public Item[] findByName(String key) {
        int num = 0;
        Item[] rsl = new Item[size];

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[num++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, num);
    }

    /*  получение заявки по id */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}