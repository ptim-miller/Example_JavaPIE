package edu.myschool.java;

import java.util.ArrayList;
import java.util.List;
//import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Hamster hamster1 = new Hamster(4, 90000000, .35f);

        Dog dog1 = new Dog(4, 2253000000.);
        dog1.setHasTail(true);

        Cat cat1 = new Cat(4, 760000000);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(hamster1);
        animals.add(cat1);
        animals.add(dog1);

        for (Animal animal: animals) {
            Class clsType = animal.getClass();
            System.out.print(clsType.getSimpleName() + " legs: " + animal.getLegs() + " | Neurons: " + animal.getNeurons());
            if(clsType == Hamster.class){
                System.out.println(" wheel speed:  " + ((Hamster)animal).getSpeed());
            } else if(clsType == Cat.class){
                System.out.println(" number of lives:  " + ((Cat)animal).getLifeCount());
            } else if(clsType == Dog.class) {
                System.out.println(" has tail:  " + ((Dog)animal).getTailStatus());
                animal.setSoundFile("bark2.wav");
                animal.playVocalSound(3);
            }
        }
    }
}
