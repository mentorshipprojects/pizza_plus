package com.pizza.service;

/**
 * Created by user on 23.02.2017.
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class Bill {

    LocalDate date = LocalDate.now();

    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");

    LocalTime time = LocalTime.now();
    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("HH:mm:ss");

    double sum;
    DecimalFormat df = new DecimalFormat("0.00");

    public void printBill(double sum, String [] arrNames, double [] arrPrices, int i){

        System.out.println("______________________________________________________________________________________");
        System.out.println("Your bill:");
        System.out.println("");

        for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {

            System.out.println(arrNames[j]+" : "+arrPrices[j]+" grn");
            sum+=arrPrices[j];
        }

        System.out.println("              Sum : "+sum+" grn");

        if(dayOfWeek.format(date).equals("1")){
            this.sum = sum;
            System.out.print("Additional rate of the present day: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("2")){
            this.sum = sum;
            System.out.print("Additional rate of the present day: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("3")){
            this.sum = sum;
            System.out.print("Additional rate of the present day: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("4")){
            this.sum = sum;
            System.out.print("Additional rate of the present day: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("5")){
            this.sum = 1.05*sum;
            System.out.print("Additional rate of the present day: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("6")){
            this.sum = 1.05*sum;
            System.out.print("Additional rate of the present day: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        else if(dayOfWeek.format(date).equals("7")){
            this.sum = 1.05*sum;
            System.out.print("Additional rate of the present day: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" grn");
            System.out.println("Total:"+df.format(this.sum)+" grn");
        }
        System.out.println("______________________________________________________________________________________");
        System.out.print(date.getDayOfWeek());
        System.out.print(" : ");
        System.out.print("Date:");
        System.out.print(d1.format(date));
        System.out.print(" : ");
        System.out.print("Time:");
        System.out.print(t1.format(time));
        System.out.print(" : ");
        System.out.println("Pizza plus wish you a wonderful day!!!");
    }
}
