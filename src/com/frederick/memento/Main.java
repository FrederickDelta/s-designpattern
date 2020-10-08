package com.frederick.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        history.push(editor.createState());
        editor.setContent("state A");
        System.out.println(editor.getContent());

        history.push(editor.createState());
        editor.setContent("state B");
        System.out.println(editor.getContent());

        history.push(editor.createState());
        editor.setContent("state C");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}