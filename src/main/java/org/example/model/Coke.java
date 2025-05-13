package org.example.model;

public class Coke extends ProductForSale{
    private double liter;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, double liter) {
        super(type, price, description);
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    @Override
    public void showDetails() {System.out.println("class: "+ getClass() + "type: "+ getType() + " price: "+ getPrice()+ " description: "+ getDescription() + " L: "+ getLiter());
    }
}
