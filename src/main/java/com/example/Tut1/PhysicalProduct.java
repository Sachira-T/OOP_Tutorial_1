package com.example.Tut1;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double weightKg(){
        return weightKg;
    }

    public String dimensions(){
        return dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

}
