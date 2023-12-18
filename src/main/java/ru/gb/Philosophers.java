package ru.gb;

public class Philosophers implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            new WorkingDay().dinner();
        }
    }
}
