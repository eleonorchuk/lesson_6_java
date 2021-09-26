package ru.geekbrains.lessons;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog bobbik = new Dog("Боббик");
        Cat murka = new Cat("Мурка");
        bobbik.run(600);
        murka.sweem(99);
        Dog[] dogs = new Dog[100];
        Cat[] cats = new Cat[100];
        for (int i =0; i<100; i++)
        {
            dogs[i] = new Dog("собака " + i);
            cats[i] = new Cat("кошка " + i);
        }
        System.out.println("Количество животных " + Animal.numOfAnimals());
        System.out.println("Количество собак " + Dog.numOfAnimals());
        System.out.println("Количество кошек " + Cat.numOfAnimals());
    }

}
