package com.pizza.domain;

import com.pizza.service.Product;
import java.util.ArrayList;

/**
 * Created by user on 08.03.2017.
 */

public class DataDrinkProduct {

    public ArrayList<Product> product = new ArrayList<>();

    public DataDrinkProduct(){

        product.add(0, new Product("Mojito",19.00));
        product.add(1, new Product("Lemonade",18.00));
        product.add(2, new Product("Lemonade with ginger",18.00));
        product.add(3, new Product("Pepsi(0,5 l)",16.00));
        product.add(4, new Product("Bonaqua(0,5 l, min. water)",16.00));
        product.add(5, new Product("Morshyns'ka(0,5 l,min. water)",16.00));
        product.add(6, new Product("Sandora juice",10.00));
    }
}
