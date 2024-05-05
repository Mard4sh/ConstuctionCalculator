package model;

public class Foundation extends ConstructionElement {
    public Foundation(String name, double pricePerSquareMeter) {
        super(name, pricePerSquareMeter);
    }

    public double calculateCost(double area) {
        return area * getPricePerSquareMeter();
    }
}
