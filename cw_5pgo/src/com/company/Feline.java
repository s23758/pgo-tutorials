package com.company;

public abstract class Feline extends Animal {
    public Feline(boolean isSleeping) {
        super(isSleeping);
    }

    @Override
    public String roam() {
        return "Cats rule the WORLD !";
    }


}
