package com.pizza.service.submenu_logic;

import com.pizza.domain.Menu;
import com.pizza.service.communication_with_user.NumberOfAction;
import com.pizza.service.interface_of_menu.ChoosePizza;
import com.pizza.service.messages.WrongAction;

/**
 * Created by user on 07.03.2017.
 */
public class PizzaService extends SubmenuService {

    public PizzaService(int i){

        super(i);
        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int j=i; j<10000; j++) {

            arrNames[j] = name;
            arrPrices[j] = price;

            ChoosePizza choose = new ChoosePizza();    // Object for displaying
            choose.choose();                           // a choice in the pizza's submenu
            int b = scan.nextInt();

            if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 | b == 6 | b == 7 | b == 8 | b == 9) {

                Menu pizzaProduct = new Menu();
                pizzaProduct.getPizzas().get(b - 1);

                NumberOfAction numberOfAction = new NumberOfAction();
                numberOfAction.printNuberOfAction(pizzaProduct.getPizzas().get(b - 1).getName(), pizzaProduct.getPizzas().get(b - 1).getPrice(), i);

                name = pizzaProduct.getPizzas().get(b - 1).getName();
                price = pizzaProduct.getPizzas().get(b - 1).getPrice();
                this.i=i;
                break;
            }
              else {
                WrongAction wrongAction = new WrongAction();
                wrongAction.printMessageAboutWrongAction();
                continue;
            }
        }
    }
}
