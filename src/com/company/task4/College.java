package com.company.task4;
import java.util.Random;
public abstract class College implements Educationalinstition{
    Random rand = new Random();
    int number = rand.nextInt(1,99);

    public void SayNumber() {
        System.out.println("Номер колледжа - " + number);
    }
}
