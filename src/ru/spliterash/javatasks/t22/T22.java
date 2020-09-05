package ru.spliterash.javatasks.t22;

import ru.spliterash.javatasks.t22.converters.FahrenheitConverter;
import ru.spliterash.javatasks.t22.converters.KelvinConverter;

public class T22 {
    public static void main(String[] args) {
        double needConvert = 23.5;
        System.out.println(String.format("C=%.2f K=%.2f", needConvert, new KelvinConverter().convert(needConvert)));
        System.out.println(String.format("C=%.2f F=%.2f", needConvert, new FahrenheitConverter().convert(needConvert)));
    }
}
