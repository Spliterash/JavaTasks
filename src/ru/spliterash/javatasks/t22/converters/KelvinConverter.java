package ru.spliterash.javatasks.t22.converters;

import ru.spliterash.javatasks.t22.Converter;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
