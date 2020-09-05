package ru.spliterash.javatasks.t18.interfaces;

public interface Shape extends Comparable<Shape> {
    double getVolume();

    default int compareTo(Shape o) {
        return Double.compare(getVolume(), o.getVolume());
    }
}
