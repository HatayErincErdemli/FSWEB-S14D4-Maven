package org.example.model;

public class Chocolate extends ProductForSale {
    private double kilogram;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, double kilogram) {
        super(type, price, description);
        this.kilogram = kilogram;
    }

    public double getKilogram() {
        return kilogram;
    }

    @Override
    public void showDetails() {
        System.out.println("class: "+ getClass() + "type: "+ getType() + " price: "+ getPrice()+ " description: "+ getDescription() + " Kg: "+ getKilogram());
    }
}
