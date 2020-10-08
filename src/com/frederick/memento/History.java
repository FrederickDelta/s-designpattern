package com.frederick.memento;

import java.util.ArrayList;

public class History {
    private ArrayList<EditorState> states = new ArrayList<EditorState>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}