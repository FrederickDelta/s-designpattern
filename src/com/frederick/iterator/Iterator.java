package com.frederick.iterator;

public interface Iterator<T> {
    T current();
    boolean hasNext();
    void next();
}
