package com.pizza.service.pizzaWith_Ingredients;

import java.util.Scanner;

/**
 * Created by user on 02.03.2017.
 */
public class PizzaBaseWithCream implements PizzaBase {
    @Override
    public void addBaseOfPizza() {
        System.out.println("Creating pizza with cream");
        System.out.println("Choose ingredients:");

        System.out.println("Press '1' to choose salami ingredient");
        System.out.println("Press '2' to choose mushroom ingredient");
        System.out.println("Press '3' to choose corn ingredient");
        System.out.println("Press '4' to choose tomatoes ingredient");
        System.out.println("Press '5' to choose pineapple ingredient");
        System.out.println("Press '6' to choose onion ingredient");
        System.out.println("Press '7' to choose egg ingredient");
        System.out.println("Press '8' to choose mozzarella ingredient");
        System.out.println("Press '9' to choose olives ingredient");
        System.out.println("Press '10' to choose bacon ingredient");

    }

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();


    }

