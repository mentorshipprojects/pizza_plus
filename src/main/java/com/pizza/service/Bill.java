package com.pizza.service;

/**
 * Created by user on 23.02.2017.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class Bill {

    LocalDate date = LocalDate.now();

    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");

    double sum;
    DecimalFormat df = new DecimalFormat("0.00");

    public Bill(double sum){

        if(dayOfWeek.format(date).equals("1")){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");

        }
        else if(dayOfWeek.format(date).equals("2")){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");

        }
        else if(dayOfWeek.format(date).equals("3")){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");
        }
        else if(dayOfWeek.format(date).equals("4")){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");
        }
        else if(dayOfWeek.format(date).equals("5")){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");
        }
        else if(dayOfWeek.format(date).equals("6")){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");
        }
        else if(dayOfWeek.format(date).equals("7")){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(df.format(this.sum-sum)+" грн");
            System.out.println("Всього:"+df.format(this.sum)+" грн");
        }
        System.out.println("______________________________________________________________________________________");
        System.out.print(date.getDayOfWeek());
        System.out.print("("+dayOfWeek.format(date)+")");
        System.out.print(" : ");
        System.out.println(d1.format(date));

    }
}
