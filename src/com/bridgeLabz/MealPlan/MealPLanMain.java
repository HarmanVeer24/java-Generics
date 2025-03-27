package com.bridgeLabz.MealPlan;
class MealPlanMain {
    public static void main(String[] args) {
        // Creating Different Meal Plans
        VegetarianMeal vegMeal = new VegetarianMeal("Paneer Curry with Rice");
        VeganMeal veganMeal = new VeganMeal("Avocado Salad");
        KetoMeal ketoMeal = new KetoMeal("Grilled Chicken with Butter");
        HighProteinMeal proteinMeal = new HighProteinMeal("Egg Whites & Oats");

        // Generating Meals using Generic Method
        Meal<VegetarianMeal> meal1 = MealPlanGenerator.createMeal(vegMeal, 500);
        Meal<VeganMeal> meal2 = MealPlanGenerator.createMeal(veganMeal, 350);
        Meal<KetoMeal> meal3 = MealPlanGenerator.createMeal(ketoMeal, 600);
        Meal<HighProteinMeal> meal4 = MealPlanGenerator.createMeal(proteinMeal, 700);

        // Managing Meal Plans
        MealPlanGenerator mealManager = new MealPlanGenerator();
        mealManager.addMeal(meal1);
        mealManager.addMeal(meal2);
        mealManager.addMeal(meal3);
        mealManager.addMeal(meal4);

        // Display All Meals
        mealManager.displayAllMeals();
    }
}
//=== Personalized Meal Plan ===
//Vegetarian Meal: Paneer Curry with Rice
//Calories: 500 kcal
//----------------
//Vegan Meal: Avocado Salad
//Calories: 350 kcal
//----------------
//Keto Meal: Grilled Chicken with Butter
//Calories: 600 kcal
//----------------
//High-Protein Meal: Egg Whites & Oats
//Calories: 700 kcal
//----------------
