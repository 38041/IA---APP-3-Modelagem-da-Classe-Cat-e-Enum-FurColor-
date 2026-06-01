package model;

import enums.Habitat;
import enums.TrainingLevel;

public class Dog extends Animal {

    private TrainingLevel trainingLevel;
    private boolean isTrained;

    public Dog(String name, int age, Habitat habitat,
               TrainingLevel trainingLevel, boolean isTrained) {

        super(name, age, habitat);

        this.trainingLevel = trainingLevel;
        this.isTrained = isTrained;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 10 hours.");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Training Level: " + trainingLevel.getDisplayName());
        System.out.println("Is Trained: " + isTrained);
    }

    public TrainingLevel getTrainingLevel() {
        return trainingLevel;
    }

    public boolean isTrained() {
        return isTrained;
    }
}