package ru.spliterash.javatasks.t6;

/**
 * Необходимо вывести на консоль такую последовательность чисел:
 * 1 2 4 8 16 32 64 128 256 512
 */
public class T6 {
    public static void main(String[] args) {
        int val = 1;
        for (int i = 1; i < 15; i++) {
            System.out.println(val);
            val *= 2;
        }
    }
}
