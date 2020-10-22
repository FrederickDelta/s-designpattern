package com.frederick.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("https://google.com");
        history.push("https://youtube.com");
        history.push("https://twitter.com");

        Iterator iterator = history.createIterator();
        while(iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
