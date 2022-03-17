package com.company.task10;

public abstract class Vehicle {
    String name;
    Integer timeHour;
    Integer timeMinute;
    Float pricePerPerson;
    Float pricePerKilogram;
    Float allPrice;

    String getName() {
        return name;
    }

    Float getAllPrice()
    {
        return pricePerKilogram * pricePerPerson;
    }

    public void VehicleInformation()
    {
        System.out.println("Это транспортное средство");
    }
}