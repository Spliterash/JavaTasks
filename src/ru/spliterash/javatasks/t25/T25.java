package ru.spliterash.javatasks.t25;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Напишите​ метод​ filter,​ который​ принимает​ на​ вход​ массив​ (любого​ типа)​ и реализацию​ ​интерфейса Filter​
 * c методом​ apply(Object​ o),​ чтобы​ убрать​ из​ массива лишнее.
 * <p>
 * Проверьте как он работает на строках или других объектах.
 */
public class T25 {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(filter(Integer.class, a, i -> i % 2 == 0)));

        String[] s = new String[]{"asdfg", "12346", "123456", null,"a","asd","ab"};
        System.out.println(Arrays.toString(filter(String.class, s, str -> str.length() > 2)));
    }

    public static <T> T[] filter(Class<T> clazz, T[] array, Predicate<T> filter) {
        //noinspection unchecked
        return Arrays
                .stream(array)
                .filter(Objects::nonNull)
                .filter(filter)
                .toArray(value -> (T[]) Array.newInstance(clazz, value));
    }
}
