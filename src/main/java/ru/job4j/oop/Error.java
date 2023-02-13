package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
    this.active = active;
    this.status = status;
    this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
        System.out.println(Boolean.toString(active) + status + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error errorParam = new Error(true, 44, "test");

        error.printInfo();
        errorParam.printInfo();
    }
}
