package org.example.model;

public class Bread extends ProductForSale{
    private int piece;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, int piece) {
        super(type, price, description);
        this.piece = piece;
    }

    public int getPiece() {
        return piece;
    }

    @Override
    public void showDetails() {System.out.println("class: "+ getClass() + "type: "+ getType() + " price: "+ getPrice()+ " description: "+ getDescription() + " tane: "+ getPiece());

    }
}
