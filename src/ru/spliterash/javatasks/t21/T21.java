package ru.spliterash.javatasks.t21;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 * Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).
 */
public class T21 {
    private static final Map<Character, Integer> dictionary = new HashMap<>();

    public static void main(String[] args) {
        String text = "Постройте частотный словарь букв русского (или английского) алфавита." +
                "Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).";
        for (char c : text.toCharArray()) {
            if (Character.isAlphabetic(c))
                dictionary.merge(c, 1, Integer::sum);
        }
        printDictionary(dictionary);
    }

    private static void printDictionary(Map<Character, Integer> dictionary) {
        dictionary
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt((ToIntFunction<Map.Entry<Character, Integer>>) Map.Entry::getValue).reversed())
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}
