package com.pizza.service.communicationWithUser;

import com.pizza.service.bill.BillService;
import com.pizza.service.interfaceOfMenu.*;
import com.pizza.service.submenuLogic.*;
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

        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int i = 0; i <10000 ; ++i) {

            arrNames[i]= getNames;
            arrPrices[i]=getPrices;

            ChooseInMainMenu chose = new ChooseInMainMenu();   // Object for displaying a choice in the main menu
            chose.choose();

            int a = scan.nextInt();

            if(a==2){   // Pizza's submenu

                PizzaMenuLogic pizzaMenu = new PizzaMenuLogic(i);

                getNames = pizzaMenu.getName();
                getPrices = pizzaMenu.getPrice();
                i = pizzaMenu.getI();
                continue;
            }
            else if(a==3){  // Drink's submenu

                DrinkMenuLogic drinkMenu = new DrinkMenuLogic(i);

                getNames = drinkMenu.getName();
                getPrices = drinkMenu.getPrice();
                i = drinkMenu.getI();

                continue;
            }
            else if(a==9){// Prints a billService

                BillService billService = new BillService();
                billService.printBill(sum, arrNames, arrPrices, i);
                break;
            }
            else {
                System.out.println("______________________________________________________________________________________");
                System.out.println("You entered wrong action. Please repeat your choice \n");
                --i;
                continue;
            }
        }
    }
}
