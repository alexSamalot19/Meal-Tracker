import java.util.Scanner;

public class MealTracker {

    public static void main(String args[]){

            // Since our User class is in the same package, we don't need to import it.
            User jim = new User("Jim", "test", "jimTest@testmail.com", 99);

            // We can call our public methods...
            jim.introduce();

            // Here, we're calling a method on the class per se.
            System.out.println(User.getCount());

        }
}
