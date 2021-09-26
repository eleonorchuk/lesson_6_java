package ru.geekbrains.lessons;

public class Dog extends Animal {
    Dog(String name)
    {
        super(name);
        System.out.println("Собаку " + name + " создали");
    }

    @Override
    public int runLengthLimit() {
        return 500;
    }

    @Override
    public int sweemLengthLimit() {
        return 10;
    }
}
