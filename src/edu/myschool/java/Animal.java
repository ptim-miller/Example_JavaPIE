package edu.myschool.java;

public class Animal extends Kingdom implements Vocal{
    private int legs;
    private double neurons;
    private String vocalFile;

    public Animal(int legCount, double neuronCount){
        super(false);
        this.legs = legCount;
        this.neurons = neuronCount;
    }

    public int getLegs(){
        return this.legs;
    }

    public double getNeurons(){
        return this.neurons;
    }

    public boolean setSoundFile(String fileName) {
        this.vocalFile = fileName;
        return true;
    }

    public void playVocalSound(int iterations) {
        for(int i = 0; i < iterations; i++){
            Player.play(this.vocalFile);
        }
    }
}
