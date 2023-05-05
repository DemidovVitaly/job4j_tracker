package ru.job4j.mytests;

public class OverSon extends Over{
    private String string;
    private int number;

    public static void say () {
        System.out.println("I am static OverSon");
    }

    public void tell(String string, int number) {
        System.out.println("not static OverSon, name " + string + " number " + number);
    }
}
