package ru.spliterash.javatasks.t28;

import java.util.Iterator;

public class MultidimensionalArrayIterator<T> implements Iterator<T> {
    private final T[][] array;
    private int x = -1;
    private int y = 0;

    public MultidimensionalArrayIterator(T[][] array) {
        this.array = array;

    }

    public boolean next(boolean moveCounter) {
        if (y < array.length) {
            T[] xArray = array[y];
            if (x + 1 < xArray.length) {
                if (moveCounter)
                    x += 1;
                return true;
            } else if (y + 1 < array.length) {
                if (moveCounter) {
                    y += 1;
                    x = 0;
                }
                return true;
            } else
                return false;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return next(false);
    }

    @Override
    public T next() {
        if (!next(true))
            throw new IllegalArgumentException("Next does not exists");
        return array[y][x];
    }
}
