package com.company.task8;

public abstract class Surgeon implements Doctor {
    @Override
    public void ShowType() {
        System.out.println("Я Хирург");
    }
}
