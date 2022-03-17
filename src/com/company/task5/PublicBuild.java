package com.company.task5;

public abstract class PublicBuild implements Zdanie {
    String name;
    public void Build()
    {
        System.out.println("Здание построено");
    }
    protected String getName() {
        return name;
    }
}
