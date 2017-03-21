package com.pizza.service.interface_of_menu;

/**
 * Created by user on 23.02.2017.
 */
public class ChooseDrink implements Choose {
    @Override
    public void choose() {
        System.out.println("Choose action:");
        System.out.println("Press '1' - Mojito");
        System.out.println("Press '2' - Lemonade");
        System.out.println("Press '3' - Lemonade with ginger");
        System.out.println("Press '4' - Pepsi(0,5 l) ");
        System.out.println("Press '5' - Bonaqua(0,5 l,min. water) ");
        System.out.println("Press '6' - Morshyns'ka(0,5 l,min. water ) ");
        System.out.println("Press '7' - Sandora juice (0,3 l) ");
    }
}
