package ru.geekbrains.lessons;

public class Animal {
    private String nameAnimal;

    private static int numberOfAnimals = 0;
    Animal(String name)
    {
        nameAnimal = name;
        numberOfAnimals++;
        System.out.println("Животное " + nameAnimal + " создали " + numberOfAnimals + " животное");
    }

    public void run(int length)
    {
        if (length > runLengthLimit())
            length = runLengthLimit();
        System.out.println(nameAnimal + " пробежал " + length + " метров");
    }

    public void sweem(int length)
    {
        if (length > sweemLengthLimit())
            length = sweemLengthLimit();
        System.out.println(nameAnimal + " проплыл " + length + " метров");
    }

    public int runLengthLimit() {
        return 0;
    }

    public int sweemLengthLimit() {
        return 0;
    }

    public static int numOfAnimals() {
        return numberOfAnimals;
    }
}
