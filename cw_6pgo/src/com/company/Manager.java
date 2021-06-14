package com.company;

public class Manager extends Employee {

    double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus=bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }


    public String toString(){
        String manager = "Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
        return manager;
    }

}
