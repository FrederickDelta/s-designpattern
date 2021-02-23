package com.frederick.iterator_ex;

public class Main {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();

        products.add(new Product(1, "foo"));
        products.add(new Product(2, "bar"));

        while (products.hasNext()) {
            System.out.println(products.current());
            products.next();
        }
    }
}
