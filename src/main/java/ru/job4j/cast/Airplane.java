package ru.job4j.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летаю по воздуху");
    }

    @Override
    public void tow() {
        System.out.println(getClass().getSimpleName() + " Меня таскает тягач по аэродрому");
    }
}
