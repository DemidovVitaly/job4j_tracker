package ru.job4j.mytests;

public class Start {
    public static void main(String[] args) {
        Over over = new Over();
        over.say();
        over.tell("Over", 43);
        System.out.println("************");

        Over overson1 = new OverSon();
        overson1.say();
        overson1.tell("OverSon1", 50);
        System.out.println("************");

        OverSon overson2 = new OverSon();
        overson2.say();
        overson2.tell("OverSon2", 60);
        System.out.println("************");
    }
}
