package ru.spliterash.javatasks.t8;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
 * первый и второй члены последовательности равны единицам
 * а каждый следующий — сумме двух предыдущих
 * <p>
 * То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
 */
public class T8 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1};
        System.out.println(1);
        System.out.println(1);
        for (int i = 0; i < 9; i++) {
            int sum = a[0] + a[1];
            System.out.println(sum);
            a[0] = a[1];
            a[1] = sum;
        }
    }
}
