package ru.geekbrains.lessons;

public class Cat extends Animal{
    Cat(String name)
    {
        super(name);
        System.out.println("Кошку " + name + " создали");
    }

    @Override
    public int runLengthLimit() {
        return 200;
    }

    @Override
    public int sweemLengthLimit() {
        return 0;
    }
}
