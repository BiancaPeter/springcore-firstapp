package com.springapps.firstapp.DIclasic;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        C c = new C(b);
        System.out.println(c.generateNumber());
    }
}
