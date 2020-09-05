package ru.spliterash.javatasks.t23;

public abstract class AbstractCommand {
    public MyStringBuilder builder;
    private final String backup;

    public AbstractCommand(MyStringBuilder builder) {
        this.builder = builder;
        this.backup = builder.toString();
    }

    public void undo() {
        builder.setText(backup);
    }

    protected abstract void execute();

}
