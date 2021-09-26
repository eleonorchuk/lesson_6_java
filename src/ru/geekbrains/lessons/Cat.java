package ru.geekbrains.lessons;

public class Cat extends Animal{
    private static int numberOfCats = 0;
    Cat(String name)
    {
        super(name);
        numberOfCats++;
        System.out.println("Кошку " + name + " создали " + numberOfCats);
    }

    @Override
    public int runLengthLimit() {
        return 200;
    }

    @Override
    public int sweemLengthLimit() {
        return 0;
    }

    public static int numOfAnimals() {
        return numberOfCats;
    }
}
