package com.frederick.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("PlainText-Heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("PlainText-Anchor");
    }
}
