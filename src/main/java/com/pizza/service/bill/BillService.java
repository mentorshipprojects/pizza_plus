package com.pizza.service.bill_service;

/**
 * Created by user on 23.02.2017.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Bill {

    LocalDate date = LocalDate.now();
    DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");     //Veriable which defines day of week

    public void printBill(double sum, String [] arrNames, double [] arrPrices, int i){

        BillContent billContent = new BillContent();
        billContent.printBeginingOfBill();

        for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {

            System.out.println(arrNames[j]+" : "+arrPrices[j]+" grn");
            sum+=arrPrices[j];
        }
        billContent.printSum(sum);


        if(dayOfWeek.format(date).equals("1")){

            billContent.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("2")){

            billContent.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("3")){

            billContent.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("4")){

            billContent.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("5")){

            billContent.printDiscountAndTotalBillOfHoliday(sum);
        }
        else if(dayOfWeek.format(date).equals("6")){

            billContent.printDiscountAndTotalBillOfHoliday(sum);
        }
        else if(dayOfWeek.format(date).equals("7")){

            billContent.printDiscountAndTotalBillOfHoliday(sum);
        }

        billContent.printDateAndTime();
    }
}
