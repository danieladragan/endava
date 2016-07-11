package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;
import static java.lang.Math.PI;
/**
 * Created by ddragan on 7/8/2016.
 */
public class Circle implements Shape2D {
    /* caracteristicile cercului */
    float radius;
    float circumference;

    /* coordonatele centrului cercului */
    float xCenter;
    float yCenter;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return (PI) * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return  2 * (float)PI * radius;
    }
}
