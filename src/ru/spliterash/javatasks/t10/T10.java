package ru.spliterash.javatasks.t10;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * <p>
 * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class T10 {
    public static void main(String[] args) {
        double[] array = new double[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        Arrays.sort(array);
        double average = DoubleStream.of(array).average().orElse(-1);

        System.out.println("Минимальное: " + array[0]);
        System.out.println("Среднее: " + average);
        System.out.println("Максимальное: " + array[array.length - 1]);
    }
}
