package com.company;

public abstract class Dog extends Canine {


    public Dog(boolean isSleeping) {
        super(isSleeping);
    }

    @Override
    public String makeNoise() {
        return "Woof Woof !";
    }

    @Override
    public String roam() {
        return super.roam();
    }




}
