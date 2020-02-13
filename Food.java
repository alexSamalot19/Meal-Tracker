import java.util.ArrayList;

public class Food {
    private final String mealName;
    private final Category mealCategory;
    private final double mealCalories;
    private final double mealCarbohydrates;
    private final double mealFat;
    private final double mealProtein;

    private final ArrayList<Category> mealCategories = new ArrayList<>();

    Food(String name, double carbs, double fat, double protein, Category category) {
        this.mealName = name;
        this.mealCategory = category;
        this.mealCarbohydrates = carbs;
        this.mealFat = fat;
        this.mealProtein = protein;

        this.mealCalories = calculateCalories(carbs, fat, protein);
    }

    private static double calculateCalories(double carbs, double fat, double protein) {
        return  fat + carbs + protein;
    }

    double getCalories() {
        return this.mealCalories;
    }

    double getCarbohydrates() {
        return this.mealCarbohydrates;
    }

    Category getCategory() {
        return this.mealCategory;
    }

    double getFat() {
        return this.mealFat;
    }

    double getProtein() {
        return this.mealProtein;
    }

    String getName() {
        return this.mealName;
    }

    void addCategory(Category category) {
        this.mealCategories.add(category);
    }

    void showCalories(){ System.out.printf("Calories are: %s %n", this.mealCalories);}

    void showFat(){ System.out.printf("Fat is: %s %n", this.mealFat);}
}

