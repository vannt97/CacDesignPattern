package com.java.modelAbstractFactory;

public class WoodTable implements Table{

    @Override
    public void create() {
        System.out.println("create wood table");
    }
}
