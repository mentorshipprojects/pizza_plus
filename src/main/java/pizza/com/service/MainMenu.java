package pizza.com.service;

import pizza.com.domain.*;
import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * Дана програма не є завершена повністю.
 * Вона не відображає багатьох характеристик повноцінного меню, яке планувалося
 * Зараз функціональними є тільки вибір Піцци(клавіша '2') і Напоїв(клавіша '3') і відповідні до них класи
 * Також наразі не передбачено функціональстей стосовно знижок та прив'язок рахунку до дати чи дня тиждня
 * Підводиться сумарний підсумок всього замовленого
 */
public class MainMenu{

    Scanner scan = new Scanner(System.in);

    public double sum = 0f;                 // Допоміжна змінна, що допомагає визначити підсумкове значення замовлення

    MainMenu(){

        String getNames = "Begin";       // Допоміжна змінна, що допомагає визначити назву замовлення в меню
        float getPrices = 0f;           // Допоміжна змінна, що допомагає визначити ціну замовлення в меню
        double sum = 0f;                 // Допоміжна змінна, що допомагає визначити підсумкове значення замовлення

        String [] arrNames = new String[1000];
        float [] arrPrices = new float[1000];

        for (int i = 0; i <10000 ; i++) {

            arrNames[i]= getNames;
            arrPrices[i]=getPrices;

            ChooseInMainMenu chose1 = new ChooseInMainMenu();   // Об'єкт для відображення
            chose1.choose();                                    // вибору в головному меню

            int a = scan.nextInt();

            if(a==2){   // Підменю Піцци

                ChoosePizza choose2 = new ChoosePizza();    // Об'єкт для відображення
                choose2.choose();                           // вибору у підменю піцци

                Pizza pizza = new Pizza();

                System.out.println("______________________________________________________________________________________");
                System.out.println("Дія №"+(i+1)+" : Замовлено: ");
                System.out.println(pizza.getName()+" : "+pizza.getPrice()+" грн ");
                System.out.println("______________________________________________________________________________________");

                getNames = pizza.getName();
                getPrices = pizza.getPrice();
                continue;
            }
            else if(a==3){  // Підменю напоїв

                ChooseDrink choose3 = new ChooseDrink();
                choose3.choose();

                Drink drink= new Drink();

                System.out.println("______________________________________________________________________________________");
                System.out.println("Дія №"+(i+1)+" : Замовлено: ");
                System.out.println(drink.getName()+" : "+drink.getPrice()+" грн ");
                System.out.println("______________________________________________________________________________________");

                getNames = drink.getName();
                getPrices = drink.getPrice();
                continue;
            }
            else if(a==9){
                System.out.println("______________________________________________________________________________________");
                System.out.println("");
                System.out.println("Ваш рахунок:");
                System.out.println("");

                for (int j = 1; j <arrNames.length-(arrNames.length-i)+1 ; j++) {

                    System.out.println(arrNames[j]+" : "+arrPrices[j]+" грн");
                       sum+=arrPrices[j];
                }

                System.out.println("              Сума : "+sum+" грн");
                System.out.println("______________________________________________________________________________________");
                CheckDiscount check = new CheckDiscount(sum);
                //check.check();
                break;
            }
            else {
                System.out.println("Неправильне введення. Повторіть дію");
                System.out.println("______________________________________________________________________________________");
                --i;
                continue;
            }
        }

    }
}
