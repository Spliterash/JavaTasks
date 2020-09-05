package ru.spliterash.javatasks.t18.shapes;

import lombok.Getter;
import lombok.Value;
import ru.spliterash.javatasks.t18.interfaces.SolidOfRevolution;

@Value
public class Ball implements SolidOfRevolution {
    @Getter
    double radius;


    @Override
    public double getVolume() {
        return (4D / 3D) * Math.PI * Math.pow(radius, 3);
    }
}
