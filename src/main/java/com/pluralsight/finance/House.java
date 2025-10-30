package com.pluralsight.finance;

import java.time.LocalDate;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int yearBuilt, int squareFeet, int bedrooms) {
        super("House", 0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        double age = currentYear - yearBuilt;
        return (100.0 * squareFeet) * (1 - 0.03636 * age);
    }
}
