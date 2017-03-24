package com.pizza.service.communication_with_user;

import com.pizza.service.bill.BillService;
import com.pizza.service.interface_of_menu.*;
import com.pizza.service.messages.WrongAction;
import com.pizza.service.submenu_logic.*;
import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * The main class for communication with user
 */

public class Communication {

    Scanner scan = new Scanner(System.in);

    Communication(){

        String getNames = "Begin";       // Additional variable, which helps to define name of the custom in the menu
        double getPrices = 0f;           // Additional variable, which helps to define price of the custom in the menu
        double sum = 0f;                 // Additional variable, which helps to define total value of the custom
        int c = 0;

        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int i = 0; i <10000 ; ++i) {

            arrNames[i]= getNames;
            arrPrices[i]=getPrices;

            ChooseInMainMenu chose = new ChooseInMainMenu();   // Object for displaying a choice in the main menu
            chose.choose();

            int a = scan.nextInt();

            if(a==2){   // Pizza's submenu

                PizzaService pizzaMenu = new PizzaService(i);

                getNames = pizzaMenu.getName();
                getPrices = pizzaMenu.getPrice();
                i = pizzaMenu.getI();
                continue;
            }
            else if(a==3){  // Drink's submenu

                DrinkService drinkMenu = new DrinkService(i);

                getNames = drinkMenu.getName();
                getPrices = drinkMenu.getPrice();
                i = drinkMenu.getI();

                continue;
            }
            else if(a==4){  //Coffee's submenu
                ++c;
                CoffeeService coffeeMenu = new CoffeeService(i, c);

                getNames = coffeeMenu .getName();
                getPrices = coffeeMenu .getPrice();
                i = coffeeMenu .getI();
            }
            else if(a==9){// Prints a billService

                BillService billService = new BillService();
                billService.printBill(sum, arrNames, arrPrices, i);
                break;
            }
            else {
                WrongAction wrongAction = new WrongAction();
                wrongAction.printMessageAboutWrongAction();
                --i;
                continue;
            }
        }
    }
}
