package ru.geekbrains.lessons;

public class Animal {
    private String nameAnimal;

    Animal(String name)
    {
        nameAnimal = name;
        System.out.println("Животное " + nameAnimal + " создали");
    }

    public void run(int length)
    {
        System.out.println(nameAnimal + " пробежал " + length + " метров");
    }

    public void sweem(int length)
    {
        System.out.println(nameAnimal + " проплыл " + length + " метров");
    }
}
