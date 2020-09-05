package ru.spliterash.javatasks.t23.commands;

import ru.spliterash.javatasks.t23.AbstractCommand;
import ru.spliterash.javatasks.t23.MyStringBuilder;

public class AddText extends AbstractCommand {

    private final String text;

    public AddText(MyStringBuilder builder, String text) {
        super(builder);
        this.text = text;
    }

    @Override
    protected void execute() {
        builder.getRaw().append(text);
    }
}
