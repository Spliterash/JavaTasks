package ru.spliterash.javatasks.t23.ob;


public interface Observable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
