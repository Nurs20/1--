package com.company.task16;

public abstract class Worker {
    String type;
    String name;

    public void SayYourJob()
    {
        System.out.println("Я " + name + " и я " + type);
    }
}
