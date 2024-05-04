package model;

public abstract class ConstructionElement {
    String name;
    double pricePerSquareMeter;

    public ConstructionElement(String name, double pricePerSquareMeter) {
        this.name = name;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public abstract double calculateCost(double area);
}
