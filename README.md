# pizza_plus

<опис роботи програми (меню) тут>

## Review #1

1. CheckDiscount, Choose, ChooseDrink, ChooseInMainMenu, ChoosePizza - це не domain (beans) класи! 
Вони не є ніякою сутністю. Вони виконюють певні дії. А це більш властово сервісам. 
При тому що ти зліпив до купи два різні сервіси: комунікація користувача з програмою і обчислення ціни меню.
2. CreateCustom і MainMenu - це рвісні методи, але вони не повязані ніяким чином з бізнес логікою програми!
Рекомендую створити окремий package і назвати його якось щоб було зрозуміло яка функціональність там є. 
3. Pizza and Drink містять Scanner. Для чого ти звязав сутність з логікою яка зчитує вхідні дані з 
консолі? Подумай як ти можеш це розєднати.
4. Опиши інструкцію як твоя програма має працювати в цьому файлі (див. вище)
5. Ніколи не залишай мертвий (закоментований) код! Коментарі лиш для того щоб описувати роботу того чи 
іншого куска коду.
~~~
    /*
    public static void main(String[] args) {
        CreateCustom cr = new CreateCustom();
    }
    */
~~~
6. Для чого ти використав default method в інтерфейсі Choose? Що заважало використати звичайний абстрактний?

## Use case #1(09.03.2017)

1. Beginning of the program:
    1.1. In the beginnig of the program you'll see such message in the console:"Press '1' for creating a new custom"
    1.2. If you press '1' you'll see the next message in the console:    
    ~~~ Choose action:
        Press '2' - Choose pizza from menu
        Press '3' - Drinks
        Press '9' - Print a bill  ~~~    
        2.1 You pressed '2':
            2.1.1. After this you'll see the next message with pizza's menu:
            ~~~ Choose action:
                Press '1' - Salami
                Press '2' - Toscana
                Press '3' - Provincialle
                Press '4' - Cardinale
                Press '5' - Picante
                Press '6' - Bismark
                Press '7' - Peperoncino
                Press '8' - Vegetariana
                Press '9' - Calabreze ~~~
            2.1.2. You pressed from '1' to '9'
            a) If you press some digit from the sequence above(press from '1' to '9') 
            you'll see some message with information about your local choice:
            ~~~ Action №1 : Reserved: 
                Salami : 58.0 grn ~~~
            and also after that console returns to previous menu:
            ~~~ Choose action:
                Press '2' - Choose pizza from menu
                Press '3' - Drinks
                Press '9' - Print a bill  ~~~
            b) If you press something else digit, for example '11' you'll see the next message in the console:
               ~~~ You entered wrong action. Please repeat your choice ~~~
               and also after that console return to pizza's menu.
            2.2. You pressed '3': 
                2.2.1. After this you'll see the next text with drink's menu:
                ~~~ Choose action:
                    Press '1' - Mojito
                    Press '2' - Lemonade
                    Press '3' - Lemonade with ginger
                    Press '4' - Pepsi(0,5 l) 
                    Press '5' - Bonaqua(0,5 l,min. water) 
                    Press '6' - Morshyns'ka(0,5 l,min. water ) 
                    Press '7' - Sandora juice (0,3 l)  ~~~
                2.2.2. You pressed from '1' to '9' 
                This situation is similar as in the previous section 2.1.2 (read above).
            2.3. You pressed '9'
            If you press '9' you'll see a message in the console with full information of your custom:
            all items, total sum of the custom, date, time etc. For example:
                    ~~~ Your bill:
                        Salami : 58.0 grn
                        Mojito : 19.0 grn
                        Vegetariana : 66.0 grn
                                      Sum : 143.0 grn
                        Additional rate of the present day: + 0 %, 0,00 grn
                        Total:143,00 grn
                        ______________________________________________________________________________________
                        THURSDAY : Date:09.03.2017 : Time:18:21:29 : Pizza plus wish you a wonderful day!!! ~~~
            2.4. You pressed something else digit
            If you press something else digit you'll see a message in the console:
            ~~~ You entered wrong action. Please repeat your choice ~~~
            and also after that console return to previous menu.
    1.3. If you press somenthing else digit you'll see the next message in the console:  
    ~~~       
        You entered wrong action. Please repeat your choice 

        Press '1' for creating a new custom
    ~~~
    
    ## Use case #2(30.08.2017)
    
    1. Beginning of the program:
    1.1. In the beginnig of the program you'll see such message in the console:"Press '1' for creating a new custom"
    1.2. If you press '1' you'll see the next message in the console:    
    ~~~ Choose action:
        Press '2' - Choose pizza from menu
        Press '3' - Drinks
        Press '4' - Coffee
        Press '9' - Print a bill  ~~~    
        2.1 You pressed '2':
            2.1.1. After this you'll see the next message with pizza's menu:
            ~~~ Choose action:
                Press '1' - Salami
                Press '2' - Toscana
                Press '3' - Provincialle
                Press '4' - Cardinale
                Press '5' - Picante
                Press '6' - Bismark
                Press '7' - Peperoncino
                Press '8' - Vegetariana
                Press '9' - Calabreze ~~~
            2.1.2. You pressed from '1' to '9'
            a) If you press some digit from the sequence above(press from '1' to '9') 
            you'll see some message with information about your local choice:
            ~~~ Action №1 : Reserved: 
                Salami : 58.0 grn ~~~
            and also after that console returns to previous menu:
            ~~~ Choose action:
                Press '2' - Choose pizza from menu
                Press '3' - Drinks
                Press '4' - Coffee
                Press '9' - Print a bill  ~~~
            b) If you press something else digit, for example '11' you'll see the next message in the console:
               ~~~ You entered wrong action. Please repeat your choice ~~~
               and also after that console return to pizza's menu.
            2.2. You pressed '3': 
                2.2.1. After this you'll see the next text with drink's menu:
                ~~~ Choose action:
                    Press '1' - Mojito
                    Press '2' - Lemonade
                    Press '3' - Lemonade with ginger
                    Press '4' - Pepsi(0,5 l) 
                    Press '5' - Bonaqua(0,5 l,min. water) 
                    Press '6' - Morshyns'ka(0,5 l,min. water ) 
                    Press '7' - Sandora juice (0,3 l)  ~~~
                2.2.2. You pressed from '1' to '7' 
                This situation is similar as in the previous section 2.1.2 (read above).
            2.3. You pressed '4': 
                2.3.1. After this you'll see the next text with drink's menu:
                ~~~ Choose action:
                    Choose action:
                    Press '1' - Espresso
                    Press '2' - Americano
                    Press '3' - Macchiato
                    Press '4' - Cappuccino
                    Press '5' - Latte  ~~~
                2.3.2. You pressed from '1' to '5' 
                This situation is similar as in the previous section 2.1.2 (read above).    
            2.4. You pressed '9':
            ~~~
            Has customer a discount?
 
            Press '1' if 'YES' 
            Press '2' if 'NO' ~~~
            
                2.4.1. If you press '1' you'll see a message in the console with full information of your custom(including 10% discount):
                all items, total sum of the custom, date, time etc. For example:
                        ~~~ Your bill:
                                    Salami : 58.0 grn
                                    Mojito : 19.0 grn
                                    Espresso : 16.0 grn
                                                  Sum : 93.0 grn
                                    Tips: 4,65 grn, Sum with tips: 97,65
                                    Your discount are 10 % : Total bill:87,89 grn
                                    ______________________________________________________________________________________
                                    MONDAY : Date: 28.08.2017 : Time: 22:21:18 : Pizza plus wish you wonderful day!!!  ~~~                                    

                2.4.2. If you press '2' you'll see a message in the console with full information of your custom(without 10% discount):
                all items, total sum of the custom, date, time etc. For example:
                         ~~~ Your bill:
                                    Salami : 58.0 grn
                                    Mojito : 19.0 grn
                                    Espresso : 16.0 grn
                                                  Sum : 93.0 grn
                                    Tips: 4,65 grn, Sum with tips: 97,65
                                    Total bill : 97,65 grn
                                    ______________________________________________________________________________________
                                    MONDAY : Date: 28.08.2017 : Time: 22:24:01 : Pizza plus wish you wonderful day!!! ~~~  
                
                2.4.3. If you press something else digit, for example '5' you'll see the next message in the console:
                ~~~ ______________________________________________________________________________________ 
                    You entered wrong action. Please repeat your choice 

                    ______________________________________________________________________________________
                    Has customer a discount?

                    Press '1' if 'YES' 
                    Press '2' if 'NO' 
                    ______________________________________________________________________________________ ~~~
                
                2.4.4. Three discount features is released in this program. On Christmas's day in the Ukraine(07.01), Independence's day(24.08) and programer's day (256 day of year(September 13 during common years and on September 12 in leap years)) all clients irresperctivly from has he discount or no he will have 50 % discount in this feast day, see example:
                 ~~~______________________________________________________________________________________
                    Your bill:

                    Toscana : 62.0 grn
                    Lemonade : 18.0 grn
                    Cappuccino : 18.0 grn
                                  Sum : 98.0 grn
                    Tips: 4,90 grn, Sum with tips: 102,90
                    Your celebration discount are 50 % : Total bill:51,45 grn
                    ______________________________________________________________________________________
                    SATURDAY : Date: 07.01.2017 : Time: 11:54:37 : Pizza plus wish you merry Christmas!!! ~~~
                
                2.4.5. Every Monday for all clients the first Coffee(from sumbenu Coffee, digit '4') is free. The next coffee won't free. See as example:
                   ~~~ ______________________________________________________________________________________
                        Your bill:

                        Espresso : 0.0 grn
                        Americano : 16.0 grn
                                      Sum : 16.0 grn
                        Tips: 0,80 grn, Sum with tips: 16,80
                        Total bill : 16,80 grn
                        ______________________________________________________________________________________
                        MONDAY : Date: 28.08.2017 : Time: 21:55:12 : Pizza plus wish you wonderful day!!!      ~~~

                                            
            2.5. You pressed something else digit
            If you press something else digit you'll see a message in the console:
            ~~~ You entered wrong action. Please repeat your choice ~~~
            and also after that console return to previous menu.
    1.3. If you press somenthing else digit you'll see the next message in the console:  
    ~~~       
        You entered wrong action. Please repeat your choice 

        Press '1' for creating a new custom
    ~~~
    
    
