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
}
