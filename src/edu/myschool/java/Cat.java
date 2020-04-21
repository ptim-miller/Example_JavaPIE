package edu.myschool.java;

public class Cat extends Animal {
    private int virtualLives;

    public Cat(int legs, double neurons){
        super(legs, neurons);
        this.virtualLives = 9;
    }

    public int reduceLifeCount(){
        if(this.virtualLives > 0){
            this.virtualLives = this.virtualLives - 1;
        }
        return this.virtualLives;
    }

    public int getLifeCount(){
        return this.virtualLives;
    }
}
