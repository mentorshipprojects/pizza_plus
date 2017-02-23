package pizza.com.domain;

/**
 * Created by user on 23.02.2017.
 */
public class ChooseDrink implements Choose {
    @Override
    public void choose() {
        System.out.println("Виберіть дію:");
        System.out.println("Клавіша '1' - Мохіто ");
        System.out.println("Клавіша '2' - Лимонад ");
        System.out.println("Клавіша '3' - Лимонад з імбирем ");
        System.out.println("Клавіша '4' - Пепсі(0,5 л) ");
        System.out.println("Клавіша '5' - Бонаква(0,5 л) ");
        System.out.println("Клавіша '6' - Моршинська(0,5 л) ");
        System.out.println("Клавіша '7' - Сік сандора (0,3 л) ");
    }
}
