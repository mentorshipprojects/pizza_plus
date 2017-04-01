package com.pizza.service.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by user on 19.03.2017.
 */
public class DateContainer {
    public LocalDate date = LocalDate.now();
    public DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");   //Variable which defines format of date

    public LocalTime time = LocalTime.now();
    public DateTimeFormatter t1 = DateTimeFormatter.ofPattern("HH:mm:ss");     //Variable which defines format of time

    public DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");     //Variable which defines day of the week
    public DateTimeFormatter dayOfYear = DateTimeFormatter.ofPattern("D");      //Variable which defines day of the year
    public DateTimeFormatter weekOfMonth = DateTimeFormatter.ofPattern("W");    //Variable which defines week of the month
    public DateTimeFormatter monthOfYear = DateTimeFormatter.ofPattern("M");    //Variable which defines month of the year

    public LocalDate independenceDay = LocalDate.parse("2017-08-24");            //Date of Independence Day
    public LocalDate christmasDay = LocalDate.parse("2017-01-07");
    public DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("dd.MM");         //Additional pattern for defining Independence Day

}
