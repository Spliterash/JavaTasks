package ru.spliterash.javatasks.t26;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */
public class T26 {
    public static void main(String[] args) {
        List<String> c = Arrays.asList("A", "B", "C", "B", "C", "A", "ASD", "ASD", "BB", "L", "BB");
        System.out.println(removeDub(c).toString());
    }

    public static <T> Collection<T> removeDub(Collection<T> collection) {
        return collection
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
