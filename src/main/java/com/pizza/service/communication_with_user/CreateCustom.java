package com.pizza.service.communication_with_user;

import com.pizza.service.messages.WrongAction;
import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * Used only for creating a custom.
 */

public class CreateCustom {

    Scanner scan = new Scanner(System.in);

    public CreateCustom(){
        System.out.println("Press '1' for creating a new custom");
        int a = scan.nextInt();

        if (a!=1){
            WrongAction wrongAction = new WrongAction();
            wrongAction.printMessageAboutWrongAction();
            new CreateCustom();
        } else{
            new Communication();
        }
    }
}
