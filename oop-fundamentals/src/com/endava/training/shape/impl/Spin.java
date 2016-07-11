package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ddragan on 7/8/2016.
 */
public class Spin {

    public static void main(String[] args) {
        Shape2D c = new Circle(7);
        Shape2D t = new Triangle(2,5,7,9,4);
        Shape2D s = new Square(9);

        System.out.println("aria cercului este " + c.computeArea() + " iar perimetrul " + c.computePerimeter());

        System.out.println("aria triunghiului este " + t.computeArea() + " iar perimetrul " + t.computePerimeter());

        System.out.println("aria patratului este " + s.computeArea() + " iar perimetrul " + s.computePerimeter());
    }
}
