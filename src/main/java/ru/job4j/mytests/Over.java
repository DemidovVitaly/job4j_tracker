package ru.job4j.mytests;

public class Over {
    private String string;
    private int number;

    public static void say () {
        System.out.println("I am static Over");
    }

    public void tell(String string, int number) {
        System.out.println("not static Over, name " + string + " number " + number);
    }
}
