package ru.spliterash.javatasks.t12;

/**
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class T12 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple)
                System.out.println(i);

        }
    }
}
