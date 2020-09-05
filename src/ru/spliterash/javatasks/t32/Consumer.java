package ru.spliterash.javatasks.t32;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;

@RequiredArgsConstructor
public class Consumer extends Thread {
    private final Queue<Integer> list;

    @SneakyThrows
    @Override
    public void run() {
        while (isAlive()) {
            synchronized (list) {
                if (list.size() == 0)
                    list.wait();
                //noinspection ConstantConditions
                int element = list.poll();
                System.out.printf("Получили: %d%n", element);
                list.notifyAll();
            }
        }
    }
}
