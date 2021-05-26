package com.company;

public abstract class Cat extends Feline {


    public Cat(boolean isSleeping) {
        super(isSleeping);
    }

    @Override
    public String roam() {
        return super.roam();
    }

    @Override
    public String makeNoise() {
        return "Miauuuu";
    }




}
