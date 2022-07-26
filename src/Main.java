public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Cheese Pizza", 13.99, "made with fresh cheese", "dinner", true);
        menu.addMenuItem(pizza);
        menu.viewMenuItem(pizza);
        System.out.println(menu.getUpdatedDate());
    }
}
