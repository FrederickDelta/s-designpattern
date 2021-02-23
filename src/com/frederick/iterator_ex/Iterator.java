package com.frederick.iterator_ex;

public interface Iterator<T> {
    T current();
    boolean hasNext();
    void next();
}
