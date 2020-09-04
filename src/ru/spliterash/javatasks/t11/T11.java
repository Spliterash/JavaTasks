package ru.spliterash.javatasks.t11;

import java.util.Arrays;
import java.util.Random;

/**
 * Реализуйте алгоритм сортировки пузырьком для сортировки массива.
 */
public class T11 {
    public static void main(String[] args) {
        int[] array = new int[15];
        // Заполнение
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("----------");
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        boolean ahShitHereWeGoAgain;
        do {
            ahShitHereWeGoAgain = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ahShitHereWeGoAgain = true;
                }
            }
        } while (ahShitHereWeGoAgain);
    }
}
