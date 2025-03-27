package com.bridgeLabz.MealPlan;

public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void showMealDetails() {
        System.out.println("Keto Meal: " + mealName);
    }
}
