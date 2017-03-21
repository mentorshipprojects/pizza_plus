package com.pizza.service.submenu_logic;

import com.pizza.domain.*;
import com.pizza.service.communication_with_user.NumberOfAction;
import com.pizza.service.date.DateContainer;
import com.pizza.service.interface_of_menu.ChooseCoffee;
import java.util.Scanner;

/**
 * Created by user on 20.03.2017.
 */
public class CoffeeService { private String name;
    private double price;
    private int i;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price= price;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Scanner scan = new Scanner(System.in);

    public CoffeeService(int i,int c){

        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int j=i; j<10000; j++) {

            arrNames[j] = name;
            arrPrices[j] = price;

            ChooseCoffee choose = new ChooseCoffee();    // Object for displaying
            choose.choose();                           // a choice in the drink's submenu
            int b = scan.nextInt();

            DateContainer dateContainer = new DateContainer();

            if(dateContainer.dayOfWeek.format(dateContainer.date).equals("1") & c<4){

                CoffeeContainerFree coffeeProduct = new CoffeeContainerFree();

                if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 ) {

                    coffeeProduct.product.get(b - 1);

                    NumberOfAction numberOfAction = new NumberOfAction();
                    numberOfAction.printNuberOfAction(coffeeProduct.product.get(b - 1).getName(), coffeeProduct.product.get(b - 1).getPrice(), i);

                    name = coffeeProduct.product.get(b - 1).getName();
                    price = coffeeProduct.product.get(b - 1).getPrice();
                    this.i=i;
                    break;
                }
                else {
                    System.out.println("______________________________________________________________________________________");
                    System.out.println("You entered wrong action. Please repeat your choice \n");
                    continue;
                }
            }
            else{

                CoffeeContainer coffeeProduct = new CoffeeContainer();

                if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 ) {

                    coffeeProduct.product.get(b - 1);

                    NumberOfAction numberOfAction = new NumberOfAction();
                    numberOfAction.printNuberOfAction(coffeeProduct.product.get(b - 1).getName(), coffeeProduct.product.get(b - 1).getPrice(), i);

                    name = coffeeProduct.product.get(b - 1).getName();
                    price = coffeeProduct.product.get(b - 1).getPrice();
                    this.i=i;
                    break;
                }
                else {
                    System.out.println("______________________________________________________________________________________");
                    System.out.println("You entered wrong action. Please repeat your choice \n");
                    continue;
                }
            }
        }
    }
}
