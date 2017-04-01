package com.pizza.service.bill;

import com.pizza.service.date.DateContainer;
import java.text.DecimalFormat;

/**
 * Created by user on 14.03.2017.
 */
public class BillContainer{

    DateContainer dateContainer = new DateContainer();

    double sum;

    //Pattern which defines format double variable
    DecimalFormat doubleFormat = new DecimalFormat("0.00");

    public void printBeginingOfBill() {
        System.out.println("______________________________________________________________________________________");
        System.out.println("Your bill:");
        System.out.println("");
    }

    public void printSum(double sum){
        System.out.println("              Sum : "+sum+" grn");
    }

    public void printDiscountAndTotalBillOfWorkingDay(double sum) {
        this.sum = sum;
        System.out.print("Additional rate of the present day: + 0 %, ");
        System.out.println(doubleFormat.format(this.sum-sum)+" grn");
    }
    public void printDiscountAndTotalBillOfHoliday(double sum) {
        this.sum = 1.05*sum;
        System.out.print("Additional rate of the present day: + 5 %, ");
        System.out.println(doubleFormat.format(this.sum-sum)+" grn");
    }

    public void printDateAndTime() {
        System.out.println("______________________________________________________________________________________");
        System.out.print(dateContainer.date.getDayOfWeek());
        System.out.print(" : ");
        System.out.print("Date: ");
        System.out.print(dateContainer.d1.format(dateContainer.date));
        System.out.print(" : ");
        System.out.print("Time: ");
        System.out.print(dateContainer.t1.format(dateContainer.time));
        System.out.print(" : ");
    }
    public void printTips(double sumWithTips, double sum){
        System.out.print("Tips: ");
        System.out.print(doubleFormat.format(sumWithTips-sum));
        System.out.print(" grn, ");
        System.out.println("Sum with tips: "+doubleFormat.format(sumWithTips));
    }
    public double printTotalBill(double sumWithTips){
        System.out.println("Total bill : "+doubleFormat.format(sumWithTips)+" grn");
        return sumWithTips;
    }
    public double printTotalBillWithCelebration(double sumWithTips){
        double totalSum;
        totalSum = sumWithTips*0.5;
        System.out.print("Your celebration discount are 50 % : ");
        System.out.println("Total bill:"+doubleFormat.format(totalSum)+" grn");
        return totalSum;
    }
    public double printTotalBillWithDiscount(double sumWithTips) {
        double totalSum;
        totalSum = sumWithTips * 0.9;
        System.out.print("Your discount are 10 % : ");
        System.out.println("Total bill:" + doubleFormat.format(totalSum) + " grn");
        return totalSum;
    }
    public String printGreeting(byte howDayIsDiscount){
        String printGreeting=" ";
        switch (howDayIsDiscount){
            case 1:{
                printGreeting = "Pizza plus wish you merry Christmas!!!";
                break;
            }
            case 2:{
                printGreeting = "Pizza plus wish you happy Independence Day!!!";
                break;
            }
            case 3:{
                printGreeting = "Pizza plus wish you happy Programmer's day!!!";
                break;
            }
            case 4:{
                printGreeting = "Pizza plus wish you wonderful day!!!";
                break;
            }
        }
        return printGreeting;
    }
}
