package com.company.task10;

public class Wagon extends Vehicle{
    public Wagon(String name, Float pricePerKilogram, Float pricePerPerson) {
        this.name = name;
        this.pricePerKilogram = pricePerKilogram * 1.4f;
        this.pricePerPerson = pricePerPerson * 1.4f;
        this.timeHour = 5;
        this.timeMinute = 20;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Это " + getName());
        System.out.println("Общая стоимость поездки: " + + getAllPrice());
        System.out.println("Время поездки: " + timeHour + ":" + timeMinute);
    }
}

