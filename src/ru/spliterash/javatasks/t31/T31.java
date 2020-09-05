package ru.spliterash.javatasks.t31;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя по очереди.
 */
public class T31 {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new NameThread("Вася");
        Thread t2 = new NameThread("Петя");
        t1.start();
        t2.start();
    }

    private static class NameThread extends Thread {
        public NameThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            lock.lock();
            try {
                System.out.printf("Моё имя: %s%n", getName());
            } finally {
                lock.unlock();
            }
        }
    }
}
