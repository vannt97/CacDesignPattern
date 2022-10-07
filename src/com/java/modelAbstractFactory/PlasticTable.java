package com.java.modelAbstractFactory;

public class PlasticTable implements Table{
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
