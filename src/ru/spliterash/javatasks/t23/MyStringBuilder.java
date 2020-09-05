package ru.spliterash.javatasks.t23;

import ru.spliterash.javatasks.t23.commands.AddText;

import java.util.LinkedList;

public class MyStringBuilder {
    private StringBuilder builder = new StringBuilder();
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
    }

    public StringBuilder getRaw() {
        return builder;
    }
}
