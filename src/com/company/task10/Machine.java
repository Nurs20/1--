package com.company.task10;

public class Machine extends Vehicle{
    public Machine(String name, Float pricePerKilogram, Float pricePerPerson) {
        this.name = name;
        this.pricePerKilogram = pricePerKilogram * 1.8f;
        this.pricePerPerson = pricePerPerson * 1.8f;
        this.timeHour = 2;
        this.timeMinute = 30;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Это " + getName());
        System.out.println("Общая стоимость поездки: " + getAllPrice());
        System.out.println("Время поездки: " + timeHour + ":" + timeMinute);
    }
}
