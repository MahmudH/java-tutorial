package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Lamb", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Cucumber", 0.20);
        hamburger.addHamburgerAddition2("Cheese", 0.30);
        hamburger.addHamburgerAddition3("Lettuce", 0.20);

        price = hamburger.itemizeHamburger();
        System.out.println(price);
    }
}
