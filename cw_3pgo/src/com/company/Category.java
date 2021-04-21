package com.company;

import java.util.ArrayList;

public class Category {
    String kategoria;
    ArrayList<Product> produkt = new ArrayList<>();

    public Category(){
    }
    public Category(String kategoria){this.kategoria = kategoria; }


    public Category(String kategoria, ArrayList<Product> product){
        this.kategoria = kategoria;
        this.produkt = produkt;
    }
    public void setKategoria(String kategoria){this.kategoria = kategoria; }
}
