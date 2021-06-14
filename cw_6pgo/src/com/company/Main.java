package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Figure circle = new Circle(3d);
	Figure parallelogram = new Parallelogram(10d,5d,8d);
	Figure rectangle = new Rectangle(15d,10);

	List<Figure> figures = new ArrayList<>(3);
	figures.add(circle);
	figures.add(parallelogram);
	figures.add(rectangle);

	for(Figure figure : figures){
	    System.out.println(figure.getType());
	    System.out.println("Area: " + figure.getArea() + " units ");
	    System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n" );
    }

	Cat mruczek = new Cat("Mruczek");
	mruczek.start();
	System.out.println(mruczek.getType());
	mruczek.stop();

	Manager manager = new Manager("Jan","Kowalski",1990,2010,"PJATK",2000d,100d);
	System.out.println(manager);



    }
}
