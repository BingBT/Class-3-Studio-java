package restaurant;

import restaurant.Menu;
import restaurant.MenuItem;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Cheese Pizza", 13.99, "made with fresh cheese", "dinner", true);
        menu.addMenuItem(pizza);
        MenuItem pizza2 = new MenuItem("Cheese Pizza", 11.99, "made with fresh cheese", "dinner", true);
        menu.addMenuItem(pizza2);
        System.out.println(pizza.equals(pizza2));
        MenuItem tacos = new MenuItem("tacos", 202.99, "just a lot of tacos", "dinner", true);
        menu.addMenuItem(tacos);
        System.out.println(menu.toString());
        menu.deleteMenuItem(pizza);
    }
}
