package com.frederick.command_undoable;

public interface UndoableCommand extends Command {
    void unexecute();
}
