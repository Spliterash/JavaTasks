package ru.spliterash.javatasks.t18.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.spliterash.javatasks.t18.interfaces.SolidOfRevolution;

@Getter
@AllArgsConstructor
public class Cylinder implements SolidOfRevolution {
    private final double height;
    private final double radius;

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
