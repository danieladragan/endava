package com.endava.training.hierarchy;

/**
 * Created by ddragan on 7/8/2016.
 */
public class B extends A {
    public void f(){
        System.out.println("Hello from B!");
    }
    public void f(int i){
        System.out.println("Hello from B - 1 arg");
    }
    public void f(int i, int j){
        System.out.println("Hello from B - 2 arg");
    }
}
