package pizza.com.service;

import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 * Допоміжний клас. Застосовується виключно для створення замовлення.
 * Після цього переходить в MainMenu()
 *
 */
public class CreateCustom {
    /*
    public static void main(String[] args) {
        CreateCustom cr = new CreateCustom();
    }
    */

    Scanner scan = new Scanner(System.in);

    public CreateCustom(){
        System.out.println("Щоб створити замовлення натисніть клавішу '1' ");
        byte a = scan.nextByte();

        if (a!=1){
            System.out.println("Введено невірну клавішу повторіть спробу");
            new CreateCustom();

        }
        else{
            new MainMenu();
        }
    }
}
