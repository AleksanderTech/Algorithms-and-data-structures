package com.alek.designpattern.decorator;

public class SteamedMilk extends CondimentDecorator{

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+.10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" steamed milk";
    }
}
