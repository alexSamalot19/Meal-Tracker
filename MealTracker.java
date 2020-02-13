import java.util.ArrayList;

public class MealTracker {

    public static void main(String args[]){

        Food omlet = new Food("westernOmlet", 1, 3, 10, Category.Protein);
        omlet.showCalories();
        omlet.showFat();

        User jim = new User("Jim", "test", "jimTest@testmail.com", 99);
        jim.introduce();


//        boolean isOnTrack() {
//            return this.getAdherence() >= this.mUser.getTargetAdherence();
//        }

//        double getAdherence() {
//            int count = 0;
//
//            for (Meal meal : this.mMeals) {
//                if (meal.isComplete()) {
//                    count += 1;
//                }
//            }
//
//            return count / this.mMeals.size() * 100;
//        }

//        int getMealCount() {
//            return this.mMeals.size();
//        }

//        void viewMeals() {
//            for (Meal meal : this.mMeals) {
//                System.out.println(meal.getName());
//            }
//        }

        }
}
