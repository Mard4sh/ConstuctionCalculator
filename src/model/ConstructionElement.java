package model;

public abstract class ConstructionElement {
    private String name;
    private double pricePerSquareMeter;

    public ConstructionElement(String name, double pricePerSquareMeter) {
        this.name = name;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

}
