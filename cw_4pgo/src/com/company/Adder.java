package com.company;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {

    int add(int x, int y){
        return x+y;
    }

    BigDecimal add(ArrayList<BigDecimal> liczby ){

        BigDecimal result = null;

        for(int i = 0; i<liczby.size(); i++){
            result = result.add(liczby.get(i));
        }




        return result;
        



        }





    }


