package com.bridgeLabz.MealPlan;

public class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void showMealDetails() {
        System.out.println("Vegetarian Meal: " + mealName);
    }
}