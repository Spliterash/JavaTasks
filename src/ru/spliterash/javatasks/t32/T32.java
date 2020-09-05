package ru.spliterash.javatasks.t32;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Одна из классических задач по многопоточности.
 * Дано два потока — производитель и потребитель.
 * Производитель генерирует некоторые данные (в примере — числа). Производитель «потребляет» их.
 * <p>
 * Два потока разделяют общий буфер данных, размер которого ограничен.
 * Если буфер пуст, потребитель должен ждать, пока там появятся данные.
 * Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные и место освободится.
 */
public class T32 {
    private final static Queue<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        int size = 2;
        Thread producer = new Producer(list, size);
        Thread consumer = new Consumer(list);

        producer.start();
        consumer.start();
    }
}
