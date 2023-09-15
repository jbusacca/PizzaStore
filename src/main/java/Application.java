import Model.Menu;
import Model.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Create Pizzas
        Pizza pizza1 = new Pizza("Cheese Pizza", 10);
        Pizza pizza2 = new Pizza("Pepperoni Pizza", 20);
        Pizza pizza3 = new Pizza("Buffalo Chicken Pizza", 30);
        Pizza pizza4 = new Pizza("Vegetarian Pizza", 40);


        List<Pizza> menu = new ArrayList<>();

        menu.add(pizza1);
        menu.add(pizza2);
        menu.add(pizza3);
        menu.add(pizza4);


        Menu pizzaMenu = new Menu(menu);

        List menu1 = pizzaMenu.getPizzaMenu();

      /*  for (int i = 0; i<pizzaMenu.getPizzaMenu().size(); i++){
            System.out.println(menu1.get(i).toString());
           }
      */
        boolean b = true;
        while(b){
            System.out.println("Please enter your desired action: (view menu/order pizza/exit): ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("view menu")){
                for (int i = 0; i<pizzaMenu.getPizzaMenu().size(); i++) {
                    System.out.println(pizzaMenu.getPizzaMenu().get(i).toString());
                }
            }
            if (input.equals("order pizza")){
                System.out.println("Please enter your pizza order: ");
                String pizzaOrder = sc.nextLine();
                System.out.println("You ordered a "+ pizzaOrder +". Would you please pay: ");
            }
            if (input.equals("exit")){
                System.out.println("Enjoy your pizza!");
                b = false;
            }

        }

    }

}

