package ru.gb;

public class WorkingDay {
    static final Object lock = new Object();
    public void dinner() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " начинает обедать (0.5 секунды)");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("философ пообедал и пошёл думать");
            think();
        }
    }
    private void think() {
        System.out.println("Философ думает");
    }
}


