package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ddragan on 7/8/2016.
 */
public class Triangle implements Shape2D {
    /* caracteristicile triunghiului */
    float base;
    float altitude;

    /* coordonatele verfurilor triunghiului */
    float xVertex1;
    float yVertex1;
    float xVertex2;
    float yVertex2;
    float xVertex3;
    float yVertex3;

    /* lungimile laturilor*/
    double side1;
    double side2;
    double side3;

    public Triangle(float side1, float side2, float side3, float base, float altitude){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.altitude = altitude;
    }

    @Override
    public double computeArea() {
        return (base * altitude) / 2;
    }

    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }
}
