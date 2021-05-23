package com.company;

import java.util.ArrayList;

public class Room {

    double powierzchnia;
    ArrayList<Furniture> meble = new ArrayList<>();

    public Room(double powierzchnia, ArrayList<Furniture> meble){
        this.powierzchnia = powierzchnia;
        this.meble = meble;
    }

    double cenaMebliWPokoju(ArrayList<Furniture> meble){
        double suma = 0;
        for(int i=0; i<meble.size(); i++){
           suma += meble.get(i).getPriceIncludingVat();
        }

        return suma;

    }


}
