package ru.spliterash.javatasks.t32;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

@RequiredArgsConstructor
public class Producer extends Thread {
    private final Queue<Integer> list;
    private final int maxSize;

    @SneakyThrows
    @Override
    public void run() {
        while (isAlive()) {
            int value = createValue();
            // Имитация загрузки с сервера
            //noinspection BusyWait
            Thread.sleep(1000);
            System.out.println("Создали: " + value);
            synchronized (list) {
                if (list.size() == maxSize)
                    list.wait();
                list.add(value);
                list.notifyAll();
            }
        }
    }

    private int createValue() {
        return ThreadLocalRandom.current().nextInt(10000);
    }
}
