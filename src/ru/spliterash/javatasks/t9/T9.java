package ru.spliterash.javatasks.t9;

import java.util.Scanner;

/**
 * Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?"
 * Ответ: троллейбус. Можно возражать, конечно, какого цвета сейчас троллейбусы - но мы не об этом.
 * <p>
 * Представим, что Вы загадываете эту загадку пользователю.
 * <p>
 * Создайте программу, которая будет считывать с консоли ответ:
 * у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
 * если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
 * если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
 * если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
 */
public class T9 {
    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner scanner = new Scanner(System.in);
        cycle:
        {
            for (int i = 0; i < 3; i++) {
                String next = scanner.nextLine().toLowerCase().trim();
                switch (next) {
                    case "троллейбус":
                        System.out.println("Правильно!");
                        break cycle;
                    case "сдаюсь":
                        printRightAnswer();
                        break cycle;
                    default:
                        if (i != 2)
                            System.out.println("Подуймай ещё.");
                        else
                            printRightAnswer();
                        break;
                }
            }
        }
    }

    private static void printRightAnswer() {
        System.out.println("Правильный ответ: троллейбус.");
    }
}
