package javaexercise._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4(); // esercizio prova fatto durante la lezione con il tutor.
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        /*double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        System.out.println(conversionDescription);*/
        celsiusToFahrenheitConversion(30);
    }

    static double celsiusToFahrenheitConversion(double celsius) {
        double fahrenheit = (celsius * 9) / 5 + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        System.out.println(conversionDescription);
        return fahrenheit;
    }


    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     * <p>
     * Make sure to put all the formatting code in the function, formatting:
     * 1) to Upper case
     * 2) Remove spaces at the start and the end
     * 3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        printCorrectNames(names);
    }

    static void printCorrectNames(List<String> incorrectNames) {
        for (int i = 0; i < incorrectNames.size(); i++) {
            String name = incorrectNames.get(i);
            name = name.toUpperCase().trim();
            for (int j = 0; j <= 9; j++) {
                if (name.contains(String.valueOf(j))) {
                    name = "Invalid";
                }
            }
            System.out.println(name);
        }

    }







    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        printVariables(5.99, "sandwich", "Nice big sandwich", 500);
    }
    static void printVariables(double myLunchPrice, String lunchType, String description, int weightInGrams) {
        System.out.println(myLunchPrice);
        System.out.println(lunchType);
        System.out.println(description);
        System.out.println(weightInGrams);
    }
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (int i = 0; i < names.size(); i++) {
            String name = convertName(names.get(i));
            System.out.println(name);
        }


    }

    static String convertName(String name) {
        name = name.toUpperCase().trim();
        for (int j = 0; j <= 9; j++) {
            if (name.contains(String.valueOf(j))) {
                name = "Invalid";
            }
            }
            return name;
        }

    }


