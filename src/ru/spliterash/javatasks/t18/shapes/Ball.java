package ru.spliterash.javatasks.t18.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.spliterash.javatasks.t18.interfaces.SolidOfRevolution;

@AllArgsConstructor
public class Ball implements SolidOfRevolution {
    @Getter
    private final double radius;


    @Override
    public double getVolume() {
        return (4D / 3D) * Math.PI * Math.pow(radius, 3);
    }
}
