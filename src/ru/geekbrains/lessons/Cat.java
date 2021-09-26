package ru.geekbrains.lessons;

public class Cat extends Animal{
    Cat(String name)
    {
        super(name);
        System.out.println("Кошку " + name + " создали");
    }
}
