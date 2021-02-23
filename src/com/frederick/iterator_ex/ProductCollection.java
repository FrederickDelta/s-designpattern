package com.frederick.iterator_ex;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements Iterator<Product> {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    private int index;

    @Override
    public Product current() {
        return products.get(index);
    }

    @Override
    public boolean hasNext() {
        return (index < products.size());
    }

    @Override
    public void next() {
        index++;
    }
}
