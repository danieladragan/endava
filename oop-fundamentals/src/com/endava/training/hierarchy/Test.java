package com.endava.training.hierarchy;

/**
 * Created by ddragan on 7/8/2016.
 */
public class Test {
    public static void main(String[] args) {
        A a = new B();  a.f(); a.f(0,0);
        B b = new C();  b.f();
        A ac = new C();  ac.f();
    }
}
