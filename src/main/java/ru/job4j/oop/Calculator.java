package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public  static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        int resSum = sum(10);
        System.out.println(resSum);

        Calculator calculator = new Calculator();
        int resMpl = calculator.multiply(5);
        System.out.println(resMpl);

        int resMinus = minus(50);
        System.out.println(resMinus);

        int resDiv = calculator.divide(80);
        System.out.println(resDiv);

        int resAll = calculator.sumAllOperation(7);
        System.out.println(resAll);
    }
}