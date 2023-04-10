package ru.job4j.cast;

public class TrackingWay {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicle = new Vehicle[] {bus, train, airplane};
        for (Vehicle v : vehicle) {
            v.move();
            v.tow();
            System.out.println();
        }
    }
}
