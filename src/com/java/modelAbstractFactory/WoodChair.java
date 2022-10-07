package com.java.modelAbstractFactory;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("create wood chair");
    }
}
