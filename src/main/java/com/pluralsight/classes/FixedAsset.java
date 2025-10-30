package com.pluralsight.classes;

import com.pluralsight.interfaces.IValuable;

public abstract class FixedAsset implements IValuable {
    private String name;
    private double value;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
