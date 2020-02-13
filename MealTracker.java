import java.util.ArrayList;

public class MealTracker {

    public static void main(String args[]){
        ArrayList<Meal> userMeals = new ArrayList<>();
        ArrayList<Food> breakfast = new ArrayList<>();
        ArrayList<Food> lunch = new ArrayList<>();
        ArrayList<Food> dinner = new ArrayList<>();

        Food omlet = new Food("westernOmlet", 1, 3, 10, Category.Protein);
        Food salad = new Food("houseSalad", 1, 1, 3, Category.Vegetable);
        Food apple = new Food("macintosh",1,1,1, Category.Fruit);
        Food chicken = new Food ("grilledChicken",1,5,10, Category.Protein);
        Food sunday = new Food("hotFudgeSunday", 3, 20, 3, Category.Fat);
        Food burger = new Food("cheeseBurger", 7, 40, 20, Category.Protein);

        breakfast.add(omlet);
        lunch.add(salad);
        lunch.add(apple);
        lunch.add(chicken);
        lunch.add(sunday);
        dinner.add(burger);


        Meal todayBreakfast = new Meal(breakfast);
        Meal todayLunch = new Meal(lunch);
        Meal todayDinner = new Meal(dinner);

        User jim = new User("Jim", "test", "jimTest@testmail.com", 99);
        jim.introduce();


            userMeals.add(todayBreakfast);
            userMeals.add(todayLunch);
            userMeals.add(todayDinner);

            double count = 0;

            for (Meal meal : userMeals) {
                if (meal.isComplete()) {
                    count += 1;

                }

            }

        double percentAdherence = (count/userMeals.size()) * 100;
        System.out.printf("You are at %f adherence %n", percentAdherence);

            if (percentAdherence>=jim.getTargetAdherence()){
                System.out.printf("Congratulations!!! %n");
            } else{
                System.out.printf("Better luck next time %n");
            }

        }
}
