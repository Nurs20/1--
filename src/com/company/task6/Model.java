package com.company.task6;

public class Model extends SiemensMobile{
    public Model(String name)
    {
        this.name = name;
    }
    public void SayModelName()
    {
        System.out.println("Model name - " + getName());
        System.out.println("Model number - " + getNumber());
    }

}
