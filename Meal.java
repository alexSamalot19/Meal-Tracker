import java.util.ArrayList;

public class Meal {

    private final ArrayList<Food> mealFoods = new ArrayList<>();
    private final String mealName;

    Meal (String name) {
        this.mealName = name;
    }

    boolean isComplete() {
        boolean protein = false;
        boolean fat = false;
        boolean fruit = false;
        boolean vegetables = false;

        for (Food food : this.mealFoods) {
            switch (food.getCategory()) {
                case Protein:
                    protein = true;
                    break;
                case Fat:
                    fat = true;
                    break;
                case Fruit:
                    fruit = true;
                    break;
                case Vegetable:
                    vegetables = true;
                    break;
            }
        }

        return fat && protein && vegetables && fruit;
    }

    double getCalories() {
        double calories = 0;

        for (Food food : this.mealFoods) {
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.mealFoods) {
            fat += food.getFat();
        }

        return fat;
    }


    double getCarbohydrates() {
        double carbohydrates = 0;

        for (Food food : this.mealFoods) {
            carbohydrates += food.getCarbohydrates();
        }

        return carbohydrates;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.mealFoods) {
            protein += food.getProtein();
        }

        return protein;
    }

    String getName() {
        return this.mealName;
    }

    void viewFoods() {
        System.out.printf("%s Meal: %n", this.mealName);
        for (Food food : this.mealFoods) {
            System.out.println(food.getName());
        }
    }

}