package com.frederick.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<String>();
    // private String[] urls = new String[10];

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() -1;
        var lastItem = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastItem;
    }

    public List<String> getUrls() {
        return urls;
    }
    // public String[] getUrls() {
    //     return urls;
    // }
}
