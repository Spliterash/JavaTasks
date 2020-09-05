package ru.spliterash.javatasks.t22.converters;

import ru.spliterash.javatasks.t22.Converter;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return 1.8 * celsius + 32;
    }
}
