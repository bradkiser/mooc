// In this assignment, we will implement a class Menu that holds information about meals that are available in a cafeteria.
// Our starting point is the following class skeleton:

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        this.meals.add(meal);
    }

    public void printMeals() {
        for (String i: this.meals) {
            System.out.println(i);
        }
    }

    public void resetMenu() {
        this.meals.clear();
    }
}