package com.alek.designpattern.decorator;

import java.io.BufferedWriter;

public class App {

    public static void main(String[] args) {

        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.cost());
        System.out.println(darkRoast.getDescription());
        System.out.println();
        darkRoast = new SteamedMilk(darkRoast);
        System.out.println(darkRoast.cost());
        System.out.println(darkRoast.getDescription());
        System.out.println();
        darkRoast = new SteamedMilk(darkRoast);
        darkRoast = new SteamedMilk(darkRoast);
        darkRoast = new SteamedMilk(darkRoast);
        System.out.println(darkRoast.cost());
        System.out.println(darkRoast.getDescription());
        System.out.println();
    }
}
