package com.pizza.domain;

import com.pizza.service.Product;
import java.util.ArrayList;

/**
 * Created by user on 20.03.2017.
 */
public class CoffeeContainerFree {
    public ArrayList<Product> product = new ArrayList<>();

    public CoffeeContainerFree(){
        product.add(0, new Product("Espresso",0.00));
        product.add(1, new Product("Americano",0.00));
        product.add(2, new Product("Macchiato",0.00));
        product.add(3, new Product("Cappuccino",0.00));
        product.add(4, new Product("Latte",0.00));
    }

}
