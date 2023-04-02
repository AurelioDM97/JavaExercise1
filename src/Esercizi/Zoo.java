package Esercizi;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();


    public void animalInZoo(Animal singleAnimal) {
        animals.add(singleAnimal);
    }

    public void printList() {
        for (Animal item : animals) {
            System.out.println(item.toString());
        }
    }

    public void printType(String animalType) {
        for (Animal item : animals) {
            if (item.getType().equals(animalType)) {
                System.out.println(item);
            } else {
            }
        }
    }

    public Double printAverageAgeOfAnimalType(String animalTypes) {

        double sum = 0;
        double average = 0;
        int count = 0;

        for (Animal item : animals) {
            if (item.getType().equals(animalTypes)) {
                count += 1;
            } else {
                count = count;
            }
            if (item.getType().equals(animalTypes)) {
                sum += item.getAge();
                average = sum / count;
            } else {
            }
        }
        System.out.println("The average age of all " + animalTypes + " is: " + average);
        return average;
    }
}
