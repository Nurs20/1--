package com.company.task5;

public class Teatr extends PublicBuild{
    public Teatr(String name)
    {
        this.name = name;
    }
    public void Output()
    {
        System.out.println("Это здание - " + getName());
    }
}
