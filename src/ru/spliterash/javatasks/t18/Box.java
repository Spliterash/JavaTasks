package ru.spliterash.javatasks.t18;

import lombok.Getter;
import ru.spliterash.javatasks.t18.interfaces.Shape;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Box implements Shape {
    @Getter
    private final double volume;
    private final Set<Shape> shapes = new HashSet<>();

    public Box(double volume) {
        this.volume = volume;
    }

    public double getOccupiedVolume() {
        return shapes.stream().mapToDouble(Shape::getVolume).sum();
    }

    public double getFreeVolume() {
        return volume - getOccupiedVolume();
    }

    public Set<Shape> getShapes() {
        return Collections.unmodifiableSet(shapes);
    }

    public boolean addShape(Shape shape) {
        double addedVolume = shape.getVolume();
        double freeVolume = getFreeVolume();
        if (freeVolume - addedVolume >= 0) {
            shapes.add(shape);
            return true;
        } else
            return false;
    }
}
