package com.frederick.command_undoable;

public class ItalicCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public ItalicCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeItalic();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
