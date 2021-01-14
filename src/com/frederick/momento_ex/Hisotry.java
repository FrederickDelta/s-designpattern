package com.frederick.momento_ex;

import java.util.ArrayList;

public class Hisotry {
    private ArrayList<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop(){
        int lastIndex = states.size() - 1;
        DocumentState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
