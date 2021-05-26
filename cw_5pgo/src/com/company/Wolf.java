package com.company;

public abstract class Wolf extends Canine {


    public Wolf(boolean isSleeping) {
        super(isSleeping);
    }

    @Override
    public String makeNoise() {
        return "I need to brush my teeths after eating that troll !";
    }


    @Override
    public String roam() {
        return super.roam();
    }


}
