package model;

public class Wall extends ConstructionElement {
    public Wall(String name, double pricePerSquareMeter) {
        super(name, pricePerSquareMeter);
    }

    @Override
    public double calculateCost(double area) {
        return area * pricePerSquareMeter;
    }
}
