package org.example.model;



public class Store {
    public static void main(String[] args) {
        Coke coke = new Coke("içecek",10,"Coca Cola", 2.5);
        Chocolate chocolate = new Chocolate("yiyecek", 5, "ülker çikolatalı gofret",0.1);
        Bread bread = new Bread("yiyecek",2,"tam buğday ekmek", 1);
        ProductForSale[] products = new ProductForSale[3];
        products[0] = coke;
        products[1] = chocolate;
        products[2] = bread;


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}