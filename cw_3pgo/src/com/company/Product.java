package com.company;

public class Product {
    String name;
    double price;
    int codeProduct, itemNumbers = 0;

    public Product(String name, double price, int codeProduct, int itemNumbers){
        this.name = name;
        this.price = price;
        this.codeProduct = codeProduct;
        this.itemNumbers = itemNumbers;
    }
    public void setCena(double price){
        this.price = price;
    }


    public void setItemNumbers(int itemNumbers){

        if(itemNumbers < 0){
            System.out.println("Liczba sztuk nie może być mniejsza od zera");
        }else{
            this.itemNumbers = itemNumbers;
        }
    }


    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getCodeProduct(){
        return codeProduct;
    }

    public int getItemNumbers(){
        return itemNumbers;
    }



}
