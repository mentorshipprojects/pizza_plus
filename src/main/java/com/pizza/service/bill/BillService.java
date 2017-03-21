package com.pizza.service.bill;

/**
 * Created by user on 23.02.2017.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class BillService {

    LocalDate date = LocalDate.now();
    DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");     //Veriable which defines day of week

    public void printBill(double sum, String [] arrNames, double [] arrPrices, int i){

        BillContainer billContainer = new BillContainer();
        billContainer.printBeginingOfBill();

        for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {

            System.out.println(arrNames[j]+" : "+arrPrices[j]+" grn");
            sum+=arrPrices[j];
        }
        billContainer.printSum(sum);


        if(dayOfWeek.format(date).equals("1")){

            billContainer.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("2")){

            billContainer.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("3")){

            billContainer.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("4")){

            billContainer.printDiscountAndTotalBillOfWorkingDay(sum);
        }
        else if(dayOfWeek.format(date).equals("5")){

            billContainer.printDiscountAndTotalBillOfHoliday(sum);
        }
        else if(dayOfWeek.format(date).equals("6")){

            billContainer.printDiscountAndTotalBillOfHoliday(sum);
        }
        else if(dayOfWeek.format(date).equals("7")){

            billContainer.printDiscountAndTotalBillOfHoliday(sum);
        }

        billContainer.printDateAndTime();
    }
}
