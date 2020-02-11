public class MealTracker {

    public static void main(String args[]){
        if (args.length == 0){
            System.out.println("Usage java MealTracker <firstName>");
            System.err.println("firstName is required");
            System.exit(1);
        }

        User user = new User(args[0]);

        user.welcomeUser();
    }
}
