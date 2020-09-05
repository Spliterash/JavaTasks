package ru.spliterash.javatasks.t18.shapes;

import lombok.Value;
import ru.spliterash.javatasks.t18.interfaces.Shape;

@Value
public class Pyramid implements Shape {
    double s, h;

    @Override
    public double getVolume() {
        return (s * h) / 3;
    }
}
