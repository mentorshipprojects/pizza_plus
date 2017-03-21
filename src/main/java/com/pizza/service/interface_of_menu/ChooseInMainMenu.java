package com.pizza.service.interface_of_menu;

/**
 * Created by user on 23.02.2017.
 */
public class ChooseInMainMenu implements Choose {
    @Override
    public void choose() {
        System.out.println("Choose action:");
        System.out.println("Press '2' - Choose pizza from menu");
        System.out.println("Press '3' - Drinks");
        System.out.println("Press '4' - Coffee");
        System.out.println("Press '9' - Print a bill");
    }
}
