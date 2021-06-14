package com.company;

public abstract class Person {
    String firstName;
    String lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthdayYear=birthdayYear;
    }

    public int getAge(){
        return 2021-birthdayYear;
    }

}
