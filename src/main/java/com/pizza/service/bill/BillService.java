package com.pizza.service.bill;

/**
 * Created by user on 23.02.2017.
 */

import com.pizza.service.date.DateService;
import com.pizza.service.discount.DiscountService;

public class BillService {

    DiscountService discountService = new DiscountService();

    double sum1;
    boolean isDiscount;
    byte howDayIsDiscount;

    public void printBill(double sum, String [] arrNames, double [] arrPrices, int i){

        double sumWithTips;     //Additional variable for discounts defining

        for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {
            sum1+=arrPrices[j];
        }

        DateService dateService = new DateService();

        sumWithTips = discountService.countDiscountOfFirstDayOfSeptember(sum1);
        isDiscount = discountService.assertIsThisDiscount();
        howDayIsDiscount = dateService.discountDefining();

        BillContainer billContainer = new BillContainer();
        billContainer.printBeginingOfBill();

        for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {
            System.out.println(arrNames[j]+" : "+arrPrices[j]+" grn");
        }

        billContainer.printSum(sum1);
        billContainer.printTips(sumWithTips,sum1);
        discountService.printDiscount(isDiscount, howDayIsDiscount, sumWithTips);
        billContainer.printDateAndTime();
        System.out.println(billContainer.printGreeting(howDayIsDiscount));

    }
}
