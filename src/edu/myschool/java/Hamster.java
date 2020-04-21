package edu.myschool.java;

public class Hamster extends Animal{
    private float wheelSpeed; //miles per hour

    public Hamster(int legs, double neurons){
        super(legs, neurons);
        this.wheelSpeed = 0.25f; //use default if not specified
    }

    public Hamster(int legs, double neurons, float speed){
        super(legs, neurons);
        this.wheelSpeed = speed;
    }

    public float getSpeed(){
        return this.wheelSpeed;
    }
}
