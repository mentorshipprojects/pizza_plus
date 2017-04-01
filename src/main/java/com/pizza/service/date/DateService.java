package com.pizza.service.date;

/**
 * Created by slavik on 31.03.17.
 */
public class DateService {
    DateContainer dateContainer = new DateContainer();

    byte discountDefining;

    public byte discountDefining(){
        if(dateContainer.dateFormatter2.format(dateContainer.christmasDay).equals
                (dateContainer.dateFormatter2.format(dateContainer.date))){
            discountDefining = 1;
        }
        else if(dateContainer.dateFormatter2.format(dateContainer.independenceDay).equals
                (dateContainer.dateFormatter2.format(dateContainer.date))){
            discountDefining = 2;
        }
        else if(dateContainer.date.getDayOfYear()==256){    //256-th is a programmer day
            discountDefining = 3;
        }
        else{
            discountDefining = 4;
        }
        return discountDefining;
    }
}
