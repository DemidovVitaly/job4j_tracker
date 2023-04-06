package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String ans = "Может быть";
        if (answer == 0) {
            ans = "Да";
        } else if (answer == 1) {
            ans = "Нет";
        }
        System.out.println("Ответ на вопрос \"" + name + "\" - " + ans);
    }
}