package ru.spliterash.javatasks.t23;

/**
 * Напишите свой класс StringBuilder с поддержкой операции undo.
 *
 * ﻿Для этого делегируйте все методы стандартному StringBuilder,
 * а в собственном классе храните список всех операций для выполнения undo(). Это будет реализацией шаблона «Команда».
 */
public class T23 {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("1234");
        if (!builder.toString().equals("1234"))
            throw new RuntimeException();

        builder.append(5);
        if (!builder.toString().equals("12345"))
            throw new RuntimeException();

        builder.undo();
        if (!builder.toString().equals("1234"))
            throw new RuntimeException();

        System.out.println("OK");
    }
}
