package com.endava.training.examples;

/**
 * Created by ddragan on 7/8/2016.
 */
public class ExtendedSimple extends Simple {
    public ExtendedSimple(){
        System.out.println("Hello from constructor whith no arg");
    }
    public ExtendedSimple(int i) {
        System.out.println("Hello from constructor with one arg");
    }
    public ExtendedSimple(int i, int j){
        System.out.println("Hello from constructor with two arg");
    }

}