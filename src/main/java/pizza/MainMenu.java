package pizza;

import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * Дана програма не є завершена повністю.
 * Вона не відображає багатьох характеристик повноцінного меню, яке планувалося
 * Зараз функціональними є тільки вибір Піцци(клавіша '2') і Напоїв(клавіша '3') і відповідні до них класи
 * Також наразі не передбачено функціональстей стосовно знижок та прив'язок рахунку до дати чи дня тиждня
 * Підводиться сумарний підсумок всього замовленого
 */
public class MainMenu {

    Scanner scan = new Scanner(System.in);

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        CreateCustom cr = new CreateCustom();
    }




    MainMenu(){

        String getNames = "Begin";       // Допоміжна змінна, що допомагає визначити назву замовлення в меню
        float getPrices = 0f;           // Допоміжна змінна, що допомагає визначити ціну замовлення в меню
        float sum = 0f;                 // Допоміжна змінна, що допомагає визначити підсумкове значення замовлення

        String [] arrNames = new String[1000];
        float [] arrPrices = new float[1000];

        for (short i = 0; i <10000 ; i++) {

            arrNames[i]= getNames;
            arrPrices[i]=getPrices;

            System.out.println("Виберіть дію:");
            /* System.out.println("Клавіша '1' - PizzaMix(клієнт сам обирає складники піцци)");                Дана функціональність покищо не працює */
            System.out.println("Клавіша '2' - вибір піцци з меню");
            System.out.println("Клавіша '3' - Напої");
            System.out.println("Клавіша '8' - Створити нове замовлення");
            System.out.println("Клавіша '9' - Роздрукувати чек ");

            byte a = scan.nextByte();

            if(a==2){
                System.out.println("Виберіть дію:");
                System.out.println("Клавіша '1' - Салямі ");
                System.out.println("Клавіша '2' - Тоскана ");
                System.out.println("Клавіша '3' - Провінціале ");
                System.out.println("Клавіша '4' - Кардінале ");
                System.out.println("Клавіша '5' - Пікантна");
                System.out.println("Клавіша '6' - Бісмарк");
                System.out.println("Клавіша '7' - Peperoncino");
                System.out.println("Клавіша '8' - Вегетеріана");
                System.out.println("Клавіша '9' - Калабрезе");

                Pizza_sMenu pizza = new Pizza_sMenu();

                System.out.println("______________________________________________________________________________________");
                System.out.println("Дія №"+(i+1)+" : Замовлено: ");
                System.out.println(pizza.getName()+" : "+pizza.getPrice()+" грн ");
                System.out.println("______________________________________________________________________________________");


                getNames = pizza.getName();
                getPrices = pizza.getPrice();
                continue;


            }
            else if(a==3){
                System.out.println("Виберіть дію:");
                System.out.println("Клавіша '1' - Мохіто ");
                System.out.println("Клавіша '2' - Лимонад ");
                System.out.println("Клавіша '3' - Лимонад з імбирем ");
                System.out.println("Клавіша '4' - Пепсі(0,5 л) ");
                System.out.println("Клавіша '5' - Бонаква(0,5 л) ");
                System.out.println("Клавіша '6' - Моршинська(0,5 л) ");
                System.out.println("Клавіша '7' - Сік сандора (0,3 л) ");

                Drinks drink= new Drinks();

                System.out.println("______________________________________________________________________________________");
                System.out.println("Дія №"+(i+1)+" : Замовлено: ");
                System.out.println(drink.getName()+" : "+drink.getPrice()+" грн ");
                System.out.println("______________________________________________________________________________________");

                getNames = drink.getName();
                getPrices = drink.getPrice();
                continue;
            }
            else if(a==8) {
                new CreateCustom();
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
                System.out.println("              Всього : "+sum+" грн");
                System.out.println("______________________________________________________________________________________");
                break;
            }
        }
    }
}
