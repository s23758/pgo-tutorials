package com.company;

import com.company.Figure;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*sideB+2*sideA;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
