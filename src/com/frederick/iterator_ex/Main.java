package com.frederick.iterator_ex;

public class Main {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();

        collection.add(new Product(1, "foo"));
        collection.add(new Product(2, "bar"));

        var productIterator = collection.createIterator();
        while (productIterator.hasNext()) {
            System.out.println(productIterator.current());
            productIterator.next();
        }
    }
}
