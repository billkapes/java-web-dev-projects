package org.launchcode;

public class Main {

    public static void main(String[] args) {
        Menu cpMenu = new Menu();
        cpMenu.addMenuItem(new MenuItem(12.9f, "pancakes", "breakfast", true));
        cpMenu.addMenuItem(new MenuItem(3.50f, "waffles", "breakfast", true));
        cpMenu.addMenuItem(new MenuItem(12.9f, "fried pickles", "lunch", true));

        cpMenu.printAll();

    }
}
