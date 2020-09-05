package ru.spliterash.javatasks.t15;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
 * <p>
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
 */
public class T15 {
    private final int[] array;
    private final int[] weight;
    private final int sum;

    public T15(int[] array, int[] weight) {
        this.array = array;
        this.weight = weight;
        this.sum = IntStream.of(weight).sum();
    }

    public int getElement() {
        int n = 0;
        int randValue = rand(1, sum);
        for (int i = 0; i < array.length; i++) {
            n += weight[i];
            if (n >= randValue)
                return array[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        T15 a = new T15(new int[]{1, 2, 3}, new int[]{1, 2, 10});
        for (int i = 0; i < 10; i++) {
            System.out.println(a.getElement());
        }
    }

    private static int rand(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
