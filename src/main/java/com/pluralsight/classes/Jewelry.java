package com.pluralsight.classes;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return (karat / 24) * 128.22;
    }
}
