package ru.spliterash.javatasks.fourth;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 * <p>
 * Например:
 * если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
 * если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.
 */
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String line = scanner.nextLine();
        int a;
        try {
            a = Integer.parseInt(line);
        } catch (NumberFormatException ex) {
            System.out.println("Надо было ввести число");
            return;
        }
        if (a <= 0) {
            System.out.println("Input A>0");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
