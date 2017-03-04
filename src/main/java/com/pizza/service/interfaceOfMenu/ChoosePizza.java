package com.pizza.service.interfaceOfMenu;

import com.pizza.service.interfaceOfMenu.Choose;

/**
 * Created by user on 23.02.2017.
 */
public class ChoosePizza implements Choose {
    @Override
    public void choose() {
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
    }
}
