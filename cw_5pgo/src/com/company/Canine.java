package com.company;

public abstract class Canine extends Animal {

    public Canine(boolean isSleeping) {
        super(isSleeping);
    }


    @Override
    public String roam() {
        return "Dogs for the win !";
    }


}
