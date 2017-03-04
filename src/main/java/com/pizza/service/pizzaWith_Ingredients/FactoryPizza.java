package com.pizza.service.pizzaWith_Ingredients;

import java.util.Scanner;

/**
 * Created by user on 02.03.2017.
 */
public class FactoryPizza {

    public double sum1;

    public double getSum1() {
        return sum1;
    }

    public void setSum1(double sum1) {
        this.sum1 = sum1;
    }

    public FactoryPizza(){

        System.out.println("Press '1' to choose pizza with cream");
        System.out.println("Press '2' to choose pizza with tomato");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a==1){

                    }
        else if(a==2){

        }
        else{
            System.out.println("You entered wrong choice.Please try again:");
            System.out.println("Press '1' to choose pizza with cream");
            System.out.println("Press '2' to choose pizza with tomato");
            new FactoryPizza();
        }
    }
}
