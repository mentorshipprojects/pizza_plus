package com.pizza.service.submenu_logic;

import com.pizza.domain.*;
import com.pizza.service.communication_with_user.NumberOfAction;
import com.pizza.service.date.DateContainer;
import com.pizza.service.interface_of_menu.ChooseCoffee;
import com.pizza.service.messages.WrongAction;

/**
 * Created by user on 20.03.2017.
 */
public class CoffeeService extends SubmenuService {

    public CoffeeService(int i,int c){

        super(i, c);
        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int j=i; j<10000; j++) {

            arrNames[j] = name;
            arrPrices[j] = price;

            ChooseCoffee choose = new ChooseCoffee();       // Object for displaying
            choose.choose();                                // a choice in the coffee's submenu
            int b = scan.nextInt();

            DateContainer dateContainer = new DateContainer();

            if(dateContainer.dayOfWeek.format(dateContainer.date).equals("2") && c<4){

                Menu coffeeProduct = new Menu();

                if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 ) {

                    coffeeProduct.getFreeCoffee().get(b - 1);

                    NumberOfAction numberOfAction = new NumberOfAction();
                    numberOfAction.printNuberOfAction(coffeeProduct.getFreeCoffee().get(b - 1).getName(), coffeeProduct.getFreeCoffee().get(b - 1).getPrice(), i);

                    name = coffeeProduct.getFreeCoffee().get(b - 1).getName();
                    price = coffeeProduct.getFreeCoffee().get(b - 1).getPrice();
                    this.i=i;
                    break;
                }
                else {
                    WrongAction wrongAction = new WrongAction();
                    wrongAction.printMessageAboutWrongAction();
                    continue;
                }
            }
            else{

                Menu coffeeProduct = new Menu();

                if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 ) {

                    coffeeProduct.getCoffee().get(b - 1);

                    NumberOfAction numberOfAction = new NumberOfAction();
                    numberOfAction.printNuberOfAction(coffeeProduct.getCoffee().get(b - 1).getName(), coffeeProduct.getCoffee().get(b - 1).getPrice(), i);

                    name = coffeeProduct.getCoffee().get(b - 1).getName();
                    price = coffeeProduct.getCoffee().get(b - 1).getPrice();
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
}
