package com.frederick.visitor;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight-Anchor");
    }

    @Override
    public void plainText() {
        System.out.println("PlainText-Anchor");
    }
}
