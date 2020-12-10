package com.frederick.mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        // Anonymous class
//        articlesListBox.addObserver(new Observer() {
//            @Override
//            public void Update() {
//                articleSelected();
//            }
//        });

        // Lambda expression
//        articlesListBox.addObserver(() -> articleSelected());

        // Direct reference
        articlesListBox.addObserver(this::articleSelected);
        titleTextBox.addObserver(this::titleChanged);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content  = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.getEnabled());
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.getEnabled());
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.getEnabled());
    }
}
