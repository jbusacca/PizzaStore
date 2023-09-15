package Model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Pizza> PizzaMenu = new ArrayList<Pizza>();

    public Menu(List<Pizza> pizzaMenu) {
        PizzaMenu = pizzaMenu;
    }
    public List<Pizza> getPizzaMenu() {
        return PizzaMenu;
    }

//    public void setPizzaMenu(List<String> pizzaMenu) {
//        PizzaMenu = pizzaMenu;
//    }

}
