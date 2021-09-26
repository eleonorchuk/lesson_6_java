package ru.geekbrains.lessons;

public class Dog extends Animal {
    Dog(String name)
    {
        super(name);
        System.out.println("Собаку " + name + " создали");
    }
}
