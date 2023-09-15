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

    public Pizza searchPizza(String name){
        System.out.println("Search pizza:"+name);
        for (Pizza pizza:this.PizzaMenu
             ) {
            System.out.println("iside for loop, pizza:"+pizza);
            if(pizza.name.equals(name)){
                System.out.println("inside IF statement, isEqual:"+pizza.name.equals(name));
                return pizza;
            }
        }
        return null;
    }
}
