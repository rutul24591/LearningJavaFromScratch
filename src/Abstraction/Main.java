package Abstraction;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object from Pig class which is inherited from abstract class Animal
        myPig.animalSound();
        myPig.sleep();
    }
}
