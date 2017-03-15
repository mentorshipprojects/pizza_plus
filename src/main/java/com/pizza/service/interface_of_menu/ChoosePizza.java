package com.pizza.service.interfaceOfMenu;

import com.pizza.service.interfaceOfMenu.Choose;

/**
 * Created by user on 23.02.2017.
 */
public class ChoosePizza implements Choose {
    @Override
    public void choose() {
        System.out.println("Choose action:");
        System.out.println("Press '1' - Salami");
        System.out.println("Press '2' - Toscana");
        System.out.println("Press '3' - Provincialle");
        System.out.println("Press '4' - Cardinale");
        System.out.println("Press '5' - Picante");
        System.out.println("Press '6' - Bismark");
        System.out.println("Press '7' - Peperoncino");
        System.out.println("Press '8' - Vegetariana");
        System.out.println("Press '9' - Calabreze");
    }
}
