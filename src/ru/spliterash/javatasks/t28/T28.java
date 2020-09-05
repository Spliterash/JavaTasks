package ru.spliterash.javatasks.t28;

/**
 * Напишите итератор по двумерному массиву.
 */
public class T28 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12, 13},
                {14, 15}
        };
        for (MultidimensionalArrayIterator<Integer> iter = new MultidimensionalArrayIterator<>(array); iter.hasNext(); ) {
            Integer next = iter.next();
            System.out.println(next);
        }
    }
}
