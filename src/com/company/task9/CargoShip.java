package com.company.task9;

public abstract class CargoShip implements Ship {
    @Override
    public void Transport() {
        System.out.println("Я перевожу материалы");
    }
}
