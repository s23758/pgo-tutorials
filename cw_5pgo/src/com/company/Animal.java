package com.company;

public abstract class Animal {

    boolean isSleeping;

    public Animal(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public abstract String makeNoise();
    public abstract String roam();




}
