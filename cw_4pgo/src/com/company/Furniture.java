package com.company;

import java.lang.invoke.VarHandle;

public class Furniture {
    String nazwa;
    double cena;
    static final double VAT = 0.23;

    public Furniture(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public double getPrice(){
        return cena;
    }

    public double getPriceIncludingVat(){

        return VAT*cena+cena;



    }




}
