package com.pizza.domain;

import java.util.ArrayList;
import com.pizza.service.*;

/**
 * Created by user on 05.03.2017.
 */
public class DataPizzaProduct {

    public ArrayList<Product> product = new ArrayList<>();

        public DataPizzaProduct(){

            product.add(0, new Product("Salami",58.00));
            product.add(1, new Product("Toscana",62.00));
            product.add(2, new Product("Provincialle",64.00));
            product.add(3, new Product("Cardinale",64.00));
            product.add(4, new Product("Picante",68.00));
            product.add(5, new Product("Bismark",64.00));
            product.add(6, new Product("Peperoncino",65.00));
            product.add(7, new Product("Vegetariana",66.00));
            product.add(8, new Product("Calabreze",72.00));
    }
}
