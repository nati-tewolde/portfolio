package com.pluralsight.classes;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight * 128.22;
    }
}
