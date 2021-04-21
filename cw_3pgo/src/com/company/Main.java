package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	User u1 = new User("Siara1337@gmail.com");
	User u2 = new User("LipskiFL@tlen.pl");
	User u3 = new User("Jurek","Killer",u1.email,"wonski1232",false);

	System.out.println(u3.email);

	Product p1 = new Product("Cygaro",297.50,1337,500);
	p1.setCena(300);
	Product p2 = new Product("Jajka",3.70,2346,500);
	p2.setItemNumbers(5);

		ArrayList<Product> products = new ArrayList<>();

		Category c1 = new Category();
		Category c2 = new Category("Nabiał");
		c1.produkt.add(p2);
		c2.produkt.add(p1);
		c1.produkt.remove(p2);
		c2.produkt.remove(p1);



    }
}
