package com.frederick.iterator_ex;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ProductIterator(this);
    }

    private class ProductIterator implements Iterator<Product> {
        private ProductCollection collection;
        private int index;

        public ProductIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public void next() {
            index++;
        }
    }

}
