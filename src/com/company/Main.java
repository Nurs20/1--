package com.company;

import com.company.task1.*;
import com.company.task10.Machine;
import com.company.task11.Plane;
import com.company.task11.Train;
import com.company.task2.*;
import com.company.task2.Student;
import com.company.task3.*;
import com.company.task4.*;
import com.company.task5.*;
import com.company.task6.*;
import com.company.task7.*;
import com.company.task8.*;
import com.company.task9.*;
import com.company.task10.*;
import com.company.task11.*;
import com.company.task13.*;
import com.company.task14.*;
import com.company.task16.*;
import com.company.task17.*;
import com.company.task18.*;

import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        //ЗАДАНИЕ 1
        /*
        Handbook handbook = new Handbook("Справочник");
        handbook.Display();
        Encyclopedy encyclopedy = new Encyclopedy("Энциклопедия");
        encyclopedy.Display();
        */

        //ЗАДАНИЕ 2
        /*
        StudentOfFaculty student1 = new StudentOfFaculty("Нурс");
        student1.getExam();
        */

        //ЗАДАНИЕ 3
        /*
        Sotrudnik supervisior = new Supervisor("Нурсултан");
        supervisior.getReport();
        Sotrudnik инженер = new I("Нурс");
        инженер.getReport();
        */

        //ЗАДАНИЕ 4
        /*
        College колледж = new College(){};
        колледж.SayNumber();
        University университет = new University();
        университет.SayNumber();
        */

        //ЗАДАНИЕ 5
        /*
        Teatr театр = new Teatr("Театр оперы и балета");
        театр.Build();
        театр.Output();
        */

        //ЗАДАНИЕ 6
        /*
        Model model = new Model("Т2400Ф");
        model.SayModelName();
        */

        //ЗАДАНИЕ 7
        /*
        Avianosez корабль1 = new Avianosez();
        корабль1.Shot();
        корабль1.LaunchRocket();
        */

        //ЗАДАНИЕ 8
        /*
        Surgeon врач1 = new Surgeon() {
        };
        Surgeon врач2 = new Neurosurgeon();
        врач1.ShowType();
        врач2.ShowType();
        */

        //ЗАДАНИЕ 9
        /*
        CargoShip танкер1 = new CargoShip() {
        };
        CargoShip танкер2 = new Tanker();
        танкер1.Transport();
        танкер2.Transport();
        */


        //ЗАДАНИЕ 10
        /*
        Machine автомобиль1 = new Machine("Автомобиль",30.3f, 20.6f);
        Bycylce велосипед1 = new Bycylce("Велосипед", 20.5f, 30.5f);
        Wagon повозка1 = new Wagon("Повозка", 15.5f, 40.0f);
        Vehicle Array[] = {автомобиль1,велосипед1,повозка1};
        for (int i = 0; i < Array.length; i++)
        {
            Array[i].VehicleInformation();
            System.out.println("-----------------------------------");
        }
        */

        //ЗАДАНИЕ 11
        /*
        Machine1 автомобиль2 = new Machine1("Москва", "Бишкек");
        Plane самолет2 = new Plane("Ош", "Бишкек");
        Train поезд2 = new Train("Магадан", "Бишкек");
        Carrier Array1[] = {автомобиль2,самолет2,поезд2};
        for (int i = 0; i < Array1.length; i++)
        {
            Array1[i].SetPrice();
            Array1[i].Show();
            System.out.println("-----------------------------------");
        }
        */

        //ЗАДАНИЕ 13
        /*
        Pupil школьник1 = new Pupil("Нурс", "Школьник", 1122);
        Pupil школьник2 = new Pupil("Атай", "Школьник", 1212);
        Student1 студент1 = new Student1("Рама", "Студент", 1234);
        Teaching Array2[] = {школьник1,студент1,школьник2};
        for (int i = 0; i < Array2.length; i++)
        {
            if (Array2[i].getType() == "Школьник")
            {
                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
            }
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < Array2.length; i++)
        {
            if (Array2[i].getType() == "Студент")
            {
                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
            }
        }
        */

        //ЗАДАНИЕ 14
        /*
        Wind флейта = new Wind();
        Stringed скрипка = new Stringed();
        Percussion барабаны = new Percussion();
        MusicInstrument Array3[] = {флейта,скрипка,барабаны};
        System.out.println("Состав оркестра");
        for (int i = 0; i < Array3.length; i++)
        {
            Array3[i].Sound();
        }
        */

        //ЗАДАНИЕ 16
       /*
        Tester тестировщик = new Tester("Нурсултан", "Тестировщик");
        Programmist программист = new Programmist("Атай", "Программист");
        Meneger менеджер = new Meneger("Рамазан", "Менеджер");
        Designer дизайнер = new Designer("Айдана", "Дизайнер");
        Analyst аналитик = new Analyst("Марал", "Аналитик");
        Worker Array4[] = {тестировщик,программист,менеджер,дизайнер,аналитик};
        for (int i = 0; i < Array4.length; i++)
        {
            Array4[i].SayYourJob();
        }
        */

        //ЗАДАНИЕ 17
        /*
        Parrot попугай = new Parrot("Вася", 5);
        Dog собака = new Dog("Бобик", 3);
        Cat кошка = new Cat("Маруся", 9);
        Pet Array5[] = {кошка,собака,попугай};
        for (int i = 0; i < Array5.length; i++)
        {
            Array5[i].Information();
        }
        */

        //ЗАДАНИЕ 18
        /*
        Cherry вишня = new Cherry(1,13,2);
        Plum слива = new Plum(2,8, 2);
        AppleTree яблоня = new AppleTree(3,14,5);
        Garden Array6[] = {вишня,слива,яблоня};
        for (int i = 0; i < Array6.length; i++)
        {
            System.out.print("Дерево под номером " + Array6[i].getNumber() + ", ");
            Array6[i].Inf();
        }
        */
    }
}