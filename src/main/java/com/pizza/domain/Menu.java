package com.pizza.domain;

import com.pizza.service.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slavik on 21.08.17.
 */
public class Menu {

    private List<Product> coffee = new ArrayList<>();
    private List<Product> pizzas = new ArrayList<>();
    private List<Product> freeCoffee = new ArrayList<>();
    private List<Product> drinks = new ArrayList<>();

    public Menu() {
        coffee.add(0, new Product("Espresso",16.00));
        coffee.add(1, new Product("Americano",16.00));
        coffee.add(2, new Product("Macchiato",18.00));
        coffee.add(3, new Product("Cappuccino",18.00));
        coffee.add(4, new Product("Latte",20.00));

        freeCoffee.add(0, new Product("Espresso",0.00));
        freeCoffee.add(1, new Product("Americano",0.00));
        freeCoffee.add(2, new Product("Macchiato",0.00));
        freeCoffee.add(3, new Product("Cappuccino",0.00));
        freeCoffee.add(4, new Product("Latte",0.00));

        drinks.add(0, new Product("Mojito",19.00));
        drinks.add(1, new Product("Lemonade",18.00));
        drinks.add(2, new Product("Lemonade with ginger",18.00));
        drinks.add(3, new Product("Pepsi(0,5 l)",16.00));
        drinks.add(4, new Product("Bonaqua(0,5 l, min. water)",16.00));
        drinks.add(5, new Product("Morshyns'ka(0,5 l,min. water)",16.00));
        drinks.add(6, new Product("Sandora juice",10.00));

        pizzas.add(0, new Product("Salami",58.00));
        pizzas.add(1, new Product("Toscana",62.00));
        pizzas.add(2, new Product("Provincialle",64.00));
        pizzas.add(3, new Product("Cardinale",64.00));
        pizzas.add(4, new Product("Picante",68.00));
        pizzas.add(5, new Product("Bismark",64.00));
        pizzas.add(6, new Product("Peperoncino",65.00));
        pizzas.add(7, new Product("Vegetariana",66.00));
        pizzas.add(8, new Product("Calabreze",72.00));
    }

    public List<Product> getCoffee() {
        return coffee;
    }

    public List<Product> getPizzas() {
        return pizzas;
    }

    public List<Product> getFreeCoffee() {
        return freeCoffee;
    }

    public List<Product> getDrinks() {
        return drinks;
    }
}
