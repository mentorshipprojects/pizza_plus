package pizza.com.domain;

/**
 * Created by user on 23.02.2017.
 */
import java.time.LocalDate;
import java.util.Calendar;
import pizza.com.service.*;

public class CheckDiscount{

    LocalDate date = LocalDate.now();
    Calendar calendar = Calendar.getInstance();

    double sum;

    public CheckDiscount(double sum){

        System.out.println(date.getDayOfWeek());

        if(Calendar.DAY_OF_WEEK==1){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього:"+this.sum+" грн");

        }
        else if(Calendar.DAY_OF_WEEK==2){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього:"+this.sum+" грн");

        }
        else if(Calendar.DAY_OF_WEEK==3){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього:"+this.sum+" грн");
        }
        else if(Calendar.DAY_OF_WEEK==4){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього:"+this.sum+" грн");
        }
        else if(Calendar.DAY_OF_WEEK==5){
            this.sum = sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 0 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього:"+this.sum+" грн");
        }
        else if(Calendar.DAY_OF_WEEK==6){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього: "+this.sum+" грн");
        }
        else if(Calendar.DAY_OF_WEEK==7){
            this.sum = 1.05*sum;
            System.out.print("Додатковий тариф сьогоднішнього дня: + 5 %, ");
            System.out.println(this.sum-sum+" грн");
            System.out.println("Всього: "+this.sum+" грн");
        }

    }
}
