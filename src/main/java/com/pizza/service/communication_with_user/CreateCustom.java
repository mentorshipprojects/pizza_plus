package com.pizza.service.communicationWithUser;

import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * Auxiliary variable. Used only for створення замовлення.
 * Після цього переходить в Communication()
 *
 */

public class CreateCustom {

    Scanner scan = new Scanner(System.in);

    public CreateCustom(){
        System.out.println("Press '1' for creating a new custom");
        int a = scan.nextInt();

        if (a!=1){
            System.out.println("______________________________________________________________________________________");
            System.out.println("You entered wrong action. Please repeat your choice \n");
            new CreateCustom();
        } else{
            new Communication();
        }
    }
}
