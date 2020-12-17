package com.frederick.visitor;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight-Heading");
    }

    @Override
    public void plainText() {
        System.out.println("PlainText-Heading");
    }
}
