package com.pizza.service.interface_of_menu;

/**
 * Created by slavik on 30.03.17.
 */
public class ChooseDiscount implements Choose {
    @Override
    public void choose() {
        System.out.println("______________________________________________________________________________________");
        System.out.println("Has customer a discount?");
        System.out.println(" ");
        System.out.println("Press '1' if 'YES' ");
        System.out.println("Press '2' if 'NO' ");
        System.out.println("______________________________________________________________________________________");
        System.out.println(" ");
    }
}
