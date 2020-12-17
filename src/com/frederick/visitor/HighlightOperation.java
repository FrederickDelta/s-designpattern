package com.frederick.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlight-Heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Highlight-Anchor");
    }
}
