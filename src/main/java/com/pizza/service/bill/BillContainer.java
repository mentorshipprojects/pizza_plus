package com.pizza.service.bill;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by user on 14.03.2017.
 */
public class BillContainer{

    LocalDate date = LocalDate.now();
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");   //Veriable which defines date

    LocalTime time = LocalTime.now();
    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("HH:mm:ss");     //Veriable which defines time

    double sum;
    DecimalFormat df = new DecimalFormat("0.00");


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
        System.out.println(df.format(this.sum-sum)+" grn");
        System.out.println("Total:"+df.format(this.sum)+" grn");
    }
    public void printDiscountAndTotalBillOfHoliday(double sum) {
        this.sum = 1.05*sum;
        System.out.print("Additional rate of the present day: + 5 %, ");
        System.out.println(df.format(this.sum-sum)+" grn");
        System.out.println("Total:"+df.format(this.sum)+" grn");
    }

    public void printDateAndTime() {
        System.out.println("______________________________________________________________________________________");
        System.out.print(date.getDayOfWeek());
        System.out.print(" : ");
        System.out.print("Date: ");
        System.out.print(d1.format(date));
        System.out.print(" : ");
        System.out.print("Time: ");
        System.out.print(t1.format(time));
        System.out.print(" : ");
        System.out.println("Pizza plus wish you a wonderful day!!!");
    }
}
