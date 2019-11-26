package com.alek.designpattern.decorator;

public abstract class Beverage {

    private String description = "Unknown beverage";

    public abstract double cost();

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
