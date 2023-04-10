package ru.job4j.cast;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Передвигаюсь по рельсам");
    }

    @Override
    public void tow() {
        System.out.println(getClass().getSimpleName() + " Меня локомотив толкает или тянет");
    }
}
