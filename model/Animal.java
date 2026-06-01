package model;

import enums.Habitat;

public abstract class Animal {

    private String name;
    private int age;
    private Habitat habitat;

    public Animal(String name, int age, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public abstract void makeSound();

    public abstract void sleep();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Habitat: " + habitat);
    }
}