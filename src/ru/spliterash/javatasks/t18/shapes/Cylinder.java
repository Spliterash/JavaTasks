package ru.spliterash.javatasks.t18.shapes;

import lombok.Value;
import ru.spliterash.javatasks.t18.interfaces.SolidOfRevolution;

@Value
public class Cylinder implements SolidOfRevolution {
    double height;
    double radius;

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
