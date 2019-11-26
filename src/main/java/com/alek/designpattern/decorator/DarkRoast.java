package com.alek.designpattern.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark roast coffee");
    }

    @Override
    public double cost() {
        return .99;
    }
}
