package ru.spliterash.javatasks.t23;

import ru.spliterash.javatasks.t23.ob.Observer;

/**
 * Напишите свой класс StringBuilder с поддержкой операции undo.
 * <p>
 * ﻿Для этого делегируйте все методы стандартному StringBuilder,
 * а в собственном классе храните список всех операций для выполнения undo(). Это будет реализацией шаблона «Команда».
 * <p>
 * Напишите свой класс StringBuilder, с возможностью оповещения других объектов об изменении своего состояния.
 * <p>
 * ﻿Для этого делегируйте все методы стандартному StringBuilder, а в собственном классе реализуйте шаблон проектирования «Наблюдатель»
 *
 * .
 */
public class T23 {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        Observer simpleObserver = text -> System.out.printf("My text is changed to:%s%n", text);
        builder.registerObserver(simpleObserver);
        builder.append("1234");
        if (!builder.toString().equals("1234"))
            throw new RuntimeException();

        builder.append(5);
        if (!builder.toString().equals("12345"))
            throw new RuntimeException();
        builder.undo();
        if (!builder.toString().equals("1234"))
            throw new RuntimeException();

        builder.removeObserver(simpleObserver);
        builder.append("new");
        if (!builder.toString().equals("1234new"))
            throw new RuntimeException();

        System.out.println("OK");
    }
}
