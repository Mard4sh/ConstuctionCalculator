package model;

public class Finishing extends ConstructionElement {
    public Finishing(String name, double pricePerSquareMeter) {
        super(name, pricePerSquareMeter);
    }

    @Override
    public double calculateCost(double area) {
        return area * pricePerSquareMeter;
    }
}
