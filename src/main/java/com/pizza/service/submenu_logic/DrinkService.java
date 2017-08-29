package com.pizza.service.submenu_logic;

import com.pizza.domain.Menu;
import com.pizza.service.communication_with_user.NumberOfAction;
import com.pizza.service.interface_of_menu.ChooseDrink;
import com.pizza.service.messages.WrongAction;

/**
 * Created by user on 08.03.2017.
 */
public class DrinkService extends SubmenuService {

    public DrinkService(int i){

        super(i);
        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int j=i; j<10000; j++) {

            arrNames[j] = name;
            arrPrices[j] = price;

            ChooseDrink choose = new ChooseDrink();    // Object for displaying
            choose.choose();                           // a choice in the drink's submenu
            int b = scan.nextInt();

            if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 | b == 6 | b==7 ) {

                Menu drinkProduct = new Menu();
                drinkProduct.getDrinks().get(b - 1);

                NumberOfAction numberOfAction = new NumberOfAction();
                numberOfAction.printNuberOfAction(drinkProduct.getDrinks().get(b - 1).getName(), drinkProduct.getDrinks().get(b - 1).getPrice(), i);

                name = drinkProduct.getDrinks().get(b - 1).getName();
                price = drinkProduct.getDrinks().get(b - 1).getPrice();
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
