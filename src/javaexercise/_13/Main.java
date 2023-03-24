package javaexercise._13;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);

        System.out.println(numbers.get(0));

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);

        System.out.println(numbers.get(0));



    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        ArrayList <String> menuItems = new ArrayList <>();
        menuItems.add("Hamburger");
        menuItems.add("Fries");
        menuItems.add("Sauce");

        ArrayList <Double> menuPrices = new ArrayList <>();
        menuPrices.add(9.80);
        menuPrices.add(4.50);
        menuPrices.add(0.50);

        System.out.println("The menu items are: " + "\n" + menuItems.get(0) + " wich cost=" + menuPrices.get(0) +
                "\n" + menuItems.get(1) + " wich cost=" + menuPrices.get(1) +
                "\n" + menuItems.get(2) + " wich costs=" + menuPrices.get(2));


    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");

        int sum = 0;   // variabile inizializzata a 0 a cui sommo ogni elemento della collezione nel ciclo for
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        for ( int i = 0; i < items.length; i++) {   //ho usato un ciclo for perchè non saprei come altro risolverlo
            sum += items[i];
        }
        System.out.println("The total is: " + sum);
    }
}
