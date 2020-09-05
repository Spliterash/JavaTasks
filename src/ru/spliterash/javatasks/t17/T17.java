package ru.spliterash.javatasks.t17;

/**
 * Найдите корень уравнения
 * ﻿cos(x^5) + x^4 - 345.3 * x - 23 = 0
 * на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
 * Используйте для этого метод деления отрезка пополам (и рекурсию).
 */
public class T17 {

    public static void main(String[] args) {
        System.out.println(step(0, 10));
    }

    public static double calculateResult(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    private static double step(double left, double right) {
        if (right - left <= 0.001)
            return left;
        double middle = left + (right - left) / 2;
        double leftResult = calculateResult(left);
        double middleResult = calculateResult(middle);
        if (leftResult * middleResult > 0)
            return step(middle, right);
        else
            return step(left, middle);
    }
}
