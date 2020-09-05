package ru.spliterash.javatasks.t16;

/**
 * Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
 * Используйте перебор и двоичный поиск для решения этой задачи.
 * <p>
 * Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
 */
public class T16 {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int needleValue = 8000000;
        {
            long a = System.currentTimeMillis();
            int result = simpleSearch(needleValue, array);
            long time = System.currentTimeMillis() - a;
            System.out.println(result + ": " + time);
        }
        {
            long a = System.currentTimeMillis();
            int result = binarySearch(needleValue, array);
            long time = System.currentTimeMillis() - a;
            System.out.println(result + ": " + time);
        }
    }

    private static int simpleSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }


    private static int binarySearch(int value, int[] array) {
        int index = -1;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else if (array[mid] == value) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
