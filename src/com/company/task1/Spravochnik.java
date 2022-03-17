package com.company.task1;

public class Spravochnik extends Book {
    public Spravochnik(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}
