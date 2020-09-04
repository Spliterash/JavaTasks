package ru.spliterash.javatasks.t14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Создайте класс, который описывает вектор (в трёхмерном пространстве).
 * <p>
 * У него должны быть:
 * <p>
 * 1 - конструктор с параметрами в виде списка координат x, y, z
 * метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
 * <p>
 * 2 - метод, вычисляющий скалярное произведение:
 * <p>
 * 3 - метод, вычисляющий векторное произведение с другим вектором:
 * <p>
 * 4 - метод, вычисляющий угол между векторами (или косинус угла):
 * косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
 * <p>
 * 5 - методы для суммы и разности:
 * <p>
 * <p>
 * 6 - статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * <p>
 * Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект"
 */
public class Vector {
    private final double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     * Длинна вектора
     */
    public double length() {
        return Math.sqrt(square(x) + square(y) + square(z));
    }

    private static double square(double number) {
        return Math.pow(number, 2);
    }

    /**
     * Скалярное произведение
     */
    public double dot(Vector o) {
        return x * o.x + y * o.y + z * o.z;
    }

    /**
     * Векторное произведение
     */
    public Vector crossProduct(Vector o) {
        double newX = y * o.z - o.y * z;
        double newY = z * o.x - o.z * x;
        double newZ = x * o.y - o.x * y;
        return new Vector(newX, newY, newZ);
    }

    /**
     * Угол между векторами
     */
    public double angle(Vector o) {
        return dot(o) / (length() * o.length());
    }

    /**
     * Сумма векторов
     */
    public Vector add(Vector o) {
        return new Vector(
                x + o.x,
                y + o.y,
                z + o.z
        );
    }

    /**
     * Разность векторов
     */
    public Vector subtract(Vector o) {
        return new Vector(
                x - o.x,
                y - o.y,
                z - o.z
        );
    }

    public static List<Vector> randomVectors(int count) {
        List<Vector> list = new ArrayList<>(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(new Vector(random.nextDouble(), random.nextDouble(), random.nextDouble()));
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 &&
                Double.compare(vector.y, y) == 0 &&
                Double.compare(vector.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
