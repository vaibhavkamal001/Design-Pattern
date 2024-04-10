import MenuItem.DinerMenu;
import MenuItem.CafeMenu;
import MenuItem.Menu;
import MenuItem.PancakeHouseMenu;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        menus.add(dinerMenu);
        menus.add(pancakeHouseMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}