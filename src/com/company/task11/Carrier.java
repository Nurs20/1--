package com.company.task11;

public abstract class Carrier {
    Integer price;
    Integer time;
    String name1;
    String name2;

    public void SetPrice()
    {
        if (name1 == "Москва" && name2 == "Бишкек")
        {
            time = 12;
            price = 12000;
        }
        else if (name1 == "Ош" && name2 == "Бишкек")
        {
            time = 3;
            price = 4000;
        }
        else
        {
            time = 6;
            price = 9000;
        }
    }

    public void Show()
    {
        System.out.println("Стоимость: " + price);
        System.out.println("Время(в часах): " + time);
    }
}
