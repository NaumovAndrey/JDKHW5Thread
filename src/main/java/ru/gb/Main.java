package ru.gb;

public class Main {
    public static void main(String[] args) {
        Thread philos1 = new Thread(new Philosophers());
        Thread philos2 = new Thread(new Philosophers());
        Thread philos3 = new Thread(new Philosophers());
        Thread philos4 = new Thread(new Philosophers());
        Thread philos5 = new Thread(new Philosophers());

        philos1.start();
        philos2.start();
        philos3.start();
        philos4.start();
        philos5.start();
    }
}