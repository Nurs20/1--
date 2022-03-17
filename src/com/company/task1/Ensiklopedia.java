package com.company.task1;

public class Ensiklopedia extends Book
{
    public Ensiklopedia(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}