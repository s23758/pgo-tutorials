package com.company;

public abstract class Lion extends Feline {


    public Lion(boolean isSleeping) {
        super(isSleeping);
    }

    @Override
    public String makeNoise() {
        return "Grrrrrr";
    }

    @Override
    public String roam() {
        return super.roam();
    }




}
