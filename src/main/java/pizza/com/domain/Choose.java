package pizza.com.domain;

/**
 * Created by user on 23.02.2017.
 */
public interface Choose {
    default void choose(){
        System.out.println("Виберіть дію");
    }
}