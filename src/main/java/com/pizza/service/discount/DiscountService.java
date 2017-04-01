package com.pizza.service.discount;

import com.pizza.service.bill.BillContainer;
import com.pizza.service.date.DateContainer;
import com.pizza.service.interface_of_menu.ChooseDiscount;
import com.pizza.service.messages.WrongAction;
import java.util.Scanner;

/**
 * Created by slavik on 28.03.17.
 */
public class DiscountService {

    DateContainer dateContainer = new DateContainer();
    BillContainer billContainer = new BillContainer();

    public double countDiscountOfFirstDayOfSeptember(double sum){
        double sumWithTips;
        if(dateContainer.monthOfYear.format(dateContainer.date).equals("9")
                & dateContainer.weekOfMonth.format(dateContainer.date).equals("1")
                & dateContainer.dayOfWeek.format(dateContainer.date).equals("7")){
            sumWithTips = sum;
        }
        else{
            sumWithTips = 1.05*sum;
        }
        return sumWithTips;
    }

    public boolean assertIsThisDiscount(){

        boolean discount = true;   //Additional variable for loop working
        int howIsDiscount;
        boolean isDiscount = false;

        while (discount == true){
            ChooseDiscount chooseDiscount = new ChooseDiscount();
            chooseDiscount.choose();

            Scanner scan = new Scanner(System.in);
            howIsDiscount = scan.nextInt();

            switch (howIsDiscount){
                case 1:{
                    isDiscount = true;
                    discount = false;
                    break;
                }
                case 2:{
                    isDiscount = false;
                    discount = false;
                    break;
                }
                default:{
                    WrongAction wrongAction = new WrongAction();
                    wrongAction.printMessageAboutWrongAction();
                    break;
                }
            }
        }
        return isDiscount;
    }

    public void printDiscount(boolean isDiscount, byte howDayIsDiscount, double sumWithTips){

        switch (howDayIsDiscount){
            case 1:{
                billContainer.printTotalBillWithCelebration(sumWithTips);
                break;
            }
            case 2:{
                billContainer.printTotalBillWithCelebration(sumWithTips);
                break;
            }
            case 3:{
                billContainer.printTotalBillWithCelebration(sumWithTips);
                break;
            }
            case 4:{
                if(isDiscount == true){
                    billContainer.printTotalBillWithDiscount(sumWithTips);
                }
                else {
                    billContainer.printTotalBill(sumWithTips);
                }
                break;
            }
        }
    }
}
