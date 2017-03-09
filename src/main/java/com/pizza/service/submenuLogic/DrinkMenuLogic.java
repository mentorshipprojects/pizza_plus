package com.pizza.service.submenuLogic;

import com.pizza.domain.DataDrinkProduct;
import com.pizza.service.communicationWithUser.NumberOfAction;
import com.pizza.service.interfaceOfMenu.ChooseDrink;
import java.util.Scanner;

/**
 * Created by user on 08.03.2017.
 */
public class DrinkMenuLogic {
    private String name;
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

    public DrinkMenuLogic(int i){

        String [] arrNames = new String[1000];
        double [] arrPrices = new double[1000];

        for (int j=i; j<10000; j++) {

            arrNames[j] = name;
            arrPrices[j] = price;

            ChooseDrink choose = new ChooseDrink();    // Об'єкт для відображення
            choose.choose();                           // вибору у підменю піцци
            int b = scan.nextInt();

            if (b == 1 | b == 2 | b == 3 | b == 4 | b == 5 | b == 6 | b==7 ) {

                DataDrinkProduct drinkProduct = new DataDrinkProduct();
                drinkProduct.product.get(b - 1);

                NumberOfAction numberOfAction = new NumberOfAction();
                numberOfAction.printNuberOfAction(drinkProduct.product.get(b - 1).getName(), drinkProduct.product.get(b - 1).getPrice(), i);

                name = drinkProduct.product.get(b - 1).getName();
                price = drinkProduct.product.get(b - 1).getPrice();
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
