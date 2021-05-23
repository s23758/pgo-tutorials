package com.company;

import java.util.ArrayList;

public class House {

    String adres;
    ArrayList<Room> listaPokoi = new ArrayList<>();
    private static int liczbaPokoi;

    public House(String adres){
        this.adres = adres;
    }

    public static House createHouse(String adres){
        House h = new House(adres);
        return h;
    }

    public void addRoom(Room r){
        listaPokoi.add(r);
    }

    public void addRoom(ArrayList<Room> listaPokoi){

        this.listaPokoi = listaPokoi;

    }

    int getRoomCount(ArrayList<Room> listaPokoi){
        int liczbaPokoi = 0;
        for (Room m : listaPokoi){
            liczbaPokoi += 1;
        }
        return liczbaPokoi;
    }










}
