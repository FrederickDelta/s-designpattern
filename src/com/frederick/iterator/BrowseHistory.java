package com.frederick.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();
//    private String[] urls1 = new String[10];
//    private CollectionType<String> urls = new CollectionType<>();

    public void push(String url){
        urls.add(url);
    }

//    public String pop(){
//        var lastIndex = urls.size() -1;
//        var lastItem = urls.get(lastIndex);
//        urls.remove(lastIndex);
//
//        return lastItem;
//    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public void next() {
            index++;
        }
    }
}
