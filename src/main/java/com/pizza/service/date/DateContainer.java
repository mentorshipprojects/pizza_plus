package com.pizza.service.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by user on 19.03.2017.
 */
public class DateContainer {
    public LocalDate date = LocalDate.now();
    public DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");   //Veriable which defines date

    public LocalTime time = LocalTime.now();
    public DateTimeFormatter t1 = DateTimeFormatter.ofPattern("HH:mm:ss");     //Veriable which defines time

    public DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("e");     //Veriable which defines day of week
}
