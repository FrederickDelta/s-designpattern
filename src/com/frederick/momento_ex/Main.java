package com.frederick.momento_ex;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Hisotry history = new Hisotry();

        history.push(doc.createState());
        doc.setContent("doc content");
        System.out.println(doc.toString());

        history.push(doc.createState());
        doc.setFontName("SimSum");
        System.out.println(doc.toString());

        history.push(doc.createState());
        doc.setFontSize(12);
        System.out.println(doc.toString());

        doc.restoreState(history.pop());
        System.out.println(doc.toString());

        doc.restoreState(history.pop());
        System.out.println(doc.toString());

        doc.restoreState(history.pop());
        System.out.println(doc.toString());
    }
}
