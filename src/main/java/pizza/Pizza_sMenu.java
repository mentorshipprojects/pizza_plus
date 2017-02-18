package pizza;

/**
 * Created by user on 16.02.2017.
 * Меню Піцци
 */
import java.util.Scanner;

public class Pizza_sMenu {

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


    public void pizzaCheck(){
        System.out.print(name+" : ");
        System.out.println(price+" грн.");
    }

    Pizza_sMenu(){

        byte res=var.nextByte();

        switch(res){

            case 1 :{
                name = "Салямі";
                price = 58;
                break;
            }
            case 2:{
                name = "Тоскана";
                price = 62;
                break;
            }
            case 3:{
                name = "Провінціале";
                price = 64;
                break;
            }
            case 4:{
                name = "Кардінале";
                price = 64;
                break;
            }
            case 5:{
                name = "Пікантна";
                price = 68;
                break;
            }
            case 6:{
                name = "Бісмарк";
                price = 64;
                break;
            }
            case 7:{
                name = "Peperoncino";
                price = 65;
                break;
            }
            case 8:{
                name = "Вегетеріана";
                price = 66;
                break;
            }
            case 9:{
                name = "Калабрезе";
                price = 72;
                break;
            }
            default:{
                System.out.println("Невірний ввід. Спробуйте ще раз");
                break;
            }

        }



    }


}
