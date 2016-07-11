package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ddragan on 7/8/2016.
 */
public class Square implements Shape2D{
    /* caracteristica patratului */
    float length;

    /* coordonatele patratului */
    float xCoord;
    float yCoord;

    public Square(float length){
        this.length = length;
    }

    @Override
    public double computeArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double computePerimeter() {
        return length * 4;
    }
}
