package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double value, double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight * 128.22;
    }
}
