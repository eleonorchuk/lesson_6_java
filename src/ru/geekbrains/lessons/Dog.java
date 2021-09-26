package ru.geekbrains.lessons;

public class Dog extends Animal {
    private static int numberOfDogs = 0;
    Dog(String name)
    {
        super(name);
        numberOfDogs++;
        System.out.println("Собаку " + name + " создали " + numberOfDogs);
    }

    @Override
    public int runLengthLimit() {
        return 500;
    }

    @Override
    public int sweemLengthLimit() {
        return 10;
    }

    public static int numOfAnimals() {
        return numberOfDogs;
    }
}
