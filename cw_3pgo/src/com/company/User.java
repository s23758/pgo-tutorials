package com.company;

public class User {
    String imie, nazwisko, email, haslo;
    boolean isGuest = true;

    public User(String email){
        this.email = email;
    }

    public User(String imie, String nazwisko, String email, String haslo, boolean isGuest){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        this.isGuest = false;
    }

}
