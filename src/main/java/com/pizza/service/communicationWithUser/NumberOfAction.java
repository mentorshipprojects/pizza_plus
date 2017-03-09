package com.pizza.service.communicationWithUser;

/**
 * Created by user on 06.03.2017.
 */

public class NumberOfAction {
    public void printNuberOfAction(String name, double price, int actionNumber){
        System.out.println("______________________________________________________________________________________");
        System.out.println("Action №"+(actionNumber+1)+" : Reserved: ");
        System.out.println(name+" : "+price+" grn ");
        System.out.println("______________________________________________________________________________________");
    }
}
