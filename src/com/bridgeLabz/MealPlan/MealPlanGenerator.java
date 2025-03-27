package com.bridgeLabz.MealPlan;

import java.util.ArrayList;
import java.util.List;

public class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> mealPlans;

    public MealPlanGenerator() {
        mealPlans = new ArrayList<>();
    }

    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    public void displayAllMeals() {
        System.out.println("\n=== Personalized Meal Plan ===");
        for (Meal<? extends MealPlan> meal : mealPlans) {
            meal.displayMealInfo();
            System.out.println("----------------");
        }
    }

    public static <T extends MealPlan> Meal<T> createMeal(T meal, int calories) {
        return new Meal<>(meal, calories);
    }
}
