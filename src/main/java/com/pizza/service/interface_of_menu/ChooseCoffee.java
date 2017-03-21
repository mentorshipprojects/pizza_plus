package com.pizza.service.interface_of_menu;

/**
 * Created by user on 20.03.2017.
 */
public class ChooseCoffee implements Choose {
    @Override
    public void choose() {
        System.out.println("Choose action:");
        System.out.println("Press '1' - Espresso");
        System.out.println("Press '2' - Americano");
        System.out.println("Press '3' - Macchiato");
        System.out.println("Press '4' - Cappuccino");
        System.out.println("Press '5' - Latte");
    }
}
