package ru.gb;

public class Main {
    public static void main(String[] args) {
        Thread philos1 = new Thread(new Philosophers(), "Философ 1");
        Thread philos2 = new Thread(new Philosophers(), "Философ 2");
        Thread philos3 = new Thread(new Philosophers(), "Философ 3");
        Thread philos4 = new Thread(new Philosophers(), "Философ 4");
        Thread philos5 = new Thread(new Philosophers(), "Философ 5");

        philos1.start();
        philos2.start();
        philos3.start();
        philos4.start();
        philos5.start();
    }
}