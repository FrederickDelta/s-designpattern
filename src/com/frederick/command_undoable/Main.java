package com.frederick.command_undoable;

public class Main {

    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.setContent("Hello World");
        var history = new History();

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        var italicCommand = new ItalicCommand(document, history);
        italicCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
        undoCommand.execute();
        System.out.println(document.getContent());
    }


}
