package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("demidov011@gmail.com", "Vitaliy Demidov");
        users.put("test@mail.ru", "Vasya Pupkin");
        for (String key : users.keySet()) {
            String name = users.get(key);
            System.out.println(key + " = " + name);
        }
    }
}
