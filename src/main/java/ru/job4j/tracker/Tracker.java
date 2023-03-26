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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    /* получение индекса по ID*/
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /* Замена заявки */
    public boolean replace(int id, Item item) {
    /* производим поиск элемента по ID */
        int indexTemp = indexOf(id);
        if (indexTemp == -1) {
            return false;
        }
        /*Проставить id с item. При замене нужно сохранять старый id */
        /*Записать в ячейку с найденным индексом объект item. Это входящий параметр.*/
        items[indexTemp].setName(item.getName());

        /*Вернуть true, если замена произведена или false, если index по id не найден.*/
        return true;
    }

    /*удаление заявки*/
    public boolean delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items[index] = null;
        System.arraycopy(items, index + 1, items, index, size - index - 1);

        items[size - 1] = null;
        size--;
        return true;
    }
}