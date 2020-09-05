package ru.spliterash.javatasks.t18.shapes;

import lombok.AllArgsConstructor;
import ru.spliterash.javatasks.t18.interfaces.Shape;

@AllArgsConstructor
public class Pyramid implements Shape {
    private final double s, h;

    @Override
    public double getVolume() {
        return (s * h) / 3;
    }
}
