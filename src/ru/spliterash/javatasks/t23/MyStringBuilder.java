package ru.spliterash.javatasks.t23;

import ru.spliterash.javatasks.t23.commands.AddText;
import ru.spliterash.javatasks.t23.ob.Observable;
import ru.spliterash.javatasks.t23.ob.Observer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyStringBuilder implements Observable {
    private StringBuilder builder = new StringBuilder();
    private final Set<Observer> observerSet = new HashSet<>();
    private final LinkedList<AbstractCommand> commands = new LinkedList<>();

    @SuppressWarnings("UnusedReturnValue")
    public MyStringBuilder append(Object object) {
        AbstractCommand command = new AddText(this, object.toString());
        command.execute();
        commands.add(command);
        return this;
    }

    public void undo() {
        if (commands.size() == 0)
            return;
        AbstractCommand lastCmd = commands.getLast();
        lastCmd.undo();
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    public void setText(String text) {
        builder = new StringBuilder(text);
        notifyObservers();
    }

    public void appendRaw(String string) {
        builder.append(string);
        notifyObservers();
    }


    @Override
    public synchronized void registerObserver(Observer o) {
        observerSet.add(o);
    }

    @Override
    public synchronized void removeObserver(Observer o) {
        observerSet.remove(o);
    }

    @Override
    public synchronized void notifyObservers() {
        observerSet.forEach(o -> o.onChange(builder.toString()));
    }
}
