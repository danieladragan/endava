package com.endava.training.hierarchy;

/**
 * Created by ddragan on 7/8/2016.
 */
public class C extends B {
    public void f(){
        System.out.println("Hello from C!");
    }
    public void f(int i){
        System.out.println("Hello from C - 1 arg");
    }
    public void f(int i, int j){
        System.out.println("Hello from C - 2 arg");
    }
}
