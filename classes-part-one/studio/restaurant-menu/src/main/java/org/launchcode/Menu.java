package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    Date lastUpdated = new Date();

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem newItem) {
        for (MenuItem item : menuItems) {
            item.setNew(false);
        }
        newItem.setNew(true);
        menuItems.add(newItem);

        lastUpdated = new Date();

    }

    public void removeMenuItem(MenuItem itemToRemove) {
        menuItems.remove(itemToRemove);
    }

    public void removeMenuItem(int index) {
        menuItems.remove(index);
    }

    public void printAll() {
        for (MenuItem item : menuItems) {
            System.out.println("" + item.getDescription() + " " + item.getPrice());
        }
    }
}
