package com.pizza.service.submenu_logic;

import java.util.Scanner;

/**
 * Created by user on 28.08.2017.
 */
abstract class SubmenuService {

    protected String name;
    protected double price;
    protected int i;
    protected int c;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price= price;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Scanner scan = new Scanner(System.in);

    SubmenuService(int i){
        this.i = i;
    }

    SubmenuService(int i, int c){
        this.i = i;
        this.c = c;
    }
}
