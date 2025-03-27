package com.bridgeLabz.MealPlan;

public class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void showMealDetails() {
        System.out.println("High-Protein Meal: " + mealName);
    }
}
