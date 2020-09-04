package ru.spliterash.javatasks.t13;

import java.util.Arrays;

/**
 * Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */
public class T13 {
    public static void main(String[] args) {
        Integer[] test_array = {12, 5, 1, 3, 5, 6, 3, 5, 8};
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static <T> T[] removeElement(T[] array, T val) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
}
