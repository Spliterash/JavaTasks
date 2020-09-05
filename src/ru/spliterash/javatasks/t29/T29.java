package ru.spliterash.javatasks.t29;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;

/**
 * Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
 * где K — значение из массива, а Integer — количество вхождений в массив.
 * <p>
 * То есть сигнатура метода выглядит так:
 * <p>
 * ﻿<K> Map<K, Integer> arrayToMap(K[] ks);
 */
public class T29 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 1, 3, 2, 8, 3, 7, 8, 4, 2, 3, 6, 8, 0, 6, 3, 2, 7, 9, 0, 2, 3, 7, 8};
        Map<Integer, Integer> map = arrayToMap(array);
        map
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt((ToIntFunction<Map.Entry<Integer, Integer>>) Map.Entry::getValue).reversed())
                .forEach(e -> System.out.printf("%d встречается %d%n", e.getKey(), e.getValue()));
    }

    public static <T> Map<T, Integer> arrayToMap(T[] array) {
        Map<T,Integer> map = new HashMap<>();
        for (T t : array) {
            map.merge(t,1,Integer::sum);
        }
        return map;
    }
}
