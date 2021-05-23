package com.company;
import java.math.BigDecimal;

public class Multiplier {
    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c, int d){
        return multiply(a,b)*c*d;
    }

    double multiply(double a, double b){
        return a*b;
    }

    BigDecimal multiply(BigDecimal a, BigDecimal b){
        BigDecimal c = a.multiply(b);
        return c;
    }

}
