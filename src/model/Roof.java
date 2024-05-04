package model;

public class Roof extends ConstructionElement {
    public Roof(String name, double pricePerSquareMeter) {
        super(name, pricePerSquareMeter);
    }

    @Override
    public double calculateCost(double area) {
        return area * pricePerSquareMeter;
    }
}
