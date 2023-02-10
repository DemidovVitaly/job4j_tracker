package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Cat`s nick " + this.name + " eat food " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("GAV");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("BLACK");
        black.show();
    }
}