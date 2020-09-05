package ru.spliterash.javatasks.t30;

/**
 * Выведете состояние потока перед его запуском​, после запуска и во время выполнения.
 */
public class T30 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Я родился, и моё состояние: " + getState());
            }
        };
        System.out.println(String.format("До запуска %s%n", thread.getState()));
        thread.start();
        thread.join();
        System.out.println("Умер, состояние: " + thread.getState());
    }
}
