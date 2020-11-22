package com.frederick.command_undoable;

public class HtmlDocument {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public void makeItalic() {
        content = "<i>" + content + "</i>";
    }
}
