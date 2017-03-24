package com.pizza.service.messages;

/**
 * Created by slavik on 24.03.17.
 */
public class WrongAction {
    private String wrongMessage = "______________________________________________________________________________________ \n"+
            "You entered wrong action. Please repeat your choice \n";

    public String printMessageAboutWrongAction(){
        System.out.println(wrongMessage);
        return wrongMessage;
    }
}
