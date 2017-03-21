package com.pizza.domain;

import com.pizza.service.Product;
import java.util.ArrayList;

/**
 * Created by user on 19.03.2017.
 */
public class CoffeeContainer {
    public ArrayList<Product> product = new ArrayList<>();

    public CoffeeContainer(){
        product.add(0, new Product("Espresso",16.00));
        product.add(1, new Product("Americano",16.00));
        product.add(2, new Product("Macchiato",18.00));
        product.add(3, new Product("Cappuccino",18.00));
        product.add(4, new Product("Latte",20.00));
    }
}
