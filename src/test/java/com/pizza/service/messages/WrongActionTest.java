package com.pizza.service.messages;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by slavik on 24.03.17.
 */
public class WrongActionTest {

    String verifyMessage ="______________________________________________________________________________________ \n"+
            "You entered wrong action. Please repeat your choice \n";

    WrongAction wrongAction = new WrongAction();

    @Test
    public void printMessageAboutWrongAction() throws Exception {
        assertEquals(verifyMessage,wrongAction.printMessageAboutWrongAction());
    }

}