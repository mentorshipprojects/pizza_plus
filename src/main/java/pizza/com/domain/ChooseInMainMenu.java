package pizza.com.domain;

/**
 * Created by user on 23.02.2017.
 */
public class ChooseInMainMenu implements Choose{
    @Override
    public void choose() {
        System.out.println("Виберіть дію:");
            /* System.out.println("Клавіша '1' - PizzaMix(клієнт сам обирає складники піцци)");                Дана функціональність покищо не працює */
        System.out.println("Клавіша '2' - Вибір піцци з меню");
        System.out.println("Клавіша '3' - Напої");
        System.out.println("Клавіша '9' - Роздрукувати чек ");
    }
}
