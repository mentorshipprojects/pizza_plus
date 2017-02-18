package pizza;

import java.util.Scanner;

/**
 * Created by user on 17.02.2017.
 * Меню напоїв
 */
public class Drinks {
    private String name;
    private float price;

    Scanner var=new Scanner(System.in);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public void drinkCheck(){
        System.out.print(name+" : ");
        System.out.println(price+" грн.");
    }





    Drinks(){

        byte res=var.nextByte();

        switch(res){

            case 1 :{
                name = "Мохіто";
                price = 19;
                break;
            }
            case 2:{
                name = "Лимонад";
                price = 18;
                break;
            }
            case 3:{
                name = "Лимонад з імбирем";
                price = 18;
                break;
            }
            case 4:{
                name = "Пепсі(0,5 л)";
                price = 16;
                break;
            }
            case 5:{
                name = "Бонаква(0,5 л)";
                price = 16;
                break;
            }
            case 6:{
                name = "Моршинська(0,5 л)";
                price = 16;
                break;
            }
            case 7:{
                name = "Соки сандора(0,3 л)";
                price = 10;
                break;
            }
            default:{
                System.out.println("Невірний ввід. Спробуйте ще раз");
                break;
            }

        }



    }
}
