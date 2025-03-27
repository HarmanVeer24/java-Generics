package com.bridgeLabz.MealPlan;

public class Meal<T extends MealPlan> {
    private T mealType;
    private int calories;

    public Meal(T mealType, int calories) {
        this.mealType = mealType;
        this.calories = calories;
    }

    public void displayMealInfo() {
        mealType.showMealDetails();
        System.out.println("Calories: " + calories + " kcal");
    }
}
