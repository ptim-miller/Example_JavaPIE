package edu.myschool.java;

import java.io.File;

public class Dog extends Animal {

    private boolean hasTail;

    public Dog(int legs, double neurons){
        super(legs, neurons);
        super.setSoundFile("bark.wav");
    }

    public void setHasTail(boolean tail){
        this.hasTail = tail;
    }

    public boolean getTailStatus(){
        return this.hasTail;
    }

    @Override
    public boolean setSoundFile(String fileName) {
        System.out.println("Sound file set in DOG CLASS! ");
        File f = new File(fileName);
        if(f.exists() && !f.isDirectory()) {
            return super.setSoundFile(fileName);
        }
        return false;
    }
}
