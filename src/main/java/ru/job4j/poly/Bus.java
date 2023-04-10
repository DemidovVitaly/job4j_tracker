package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Bus capacity is " + passengers);
    }

    @Override
    public double refuel(double fuel) {
        double coast = 59.60 * fuel;
        System.out.println("Bus tank full coast is " + coast);
        return coast;
    }
}
