package com.bridgeLabz.MealPlan;

public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void showMealDetails() {
        System.out.println("Vegan Meal: " + mealName);
    }
}
