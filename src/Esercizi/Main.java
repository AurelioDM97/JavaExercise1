package Esercizi;

public class Main {
    public static void main(String args[]) {

        Animal animal = new Animal("Alex","Light Brown", "Lion", 5);
        Animal animal2 = new Animal("Marty", "Black with white stripes", "Zebra", 8);
        Animal animal3 = new Animal("Kowalski", "Black and White", "Penguin", 11);
        Animal animal4 = new Animal("Skipper", "Black and White", "Penguin", 9);
        Animal animal5 = new Animal("Zuba", "Dark Brown", "Lion", 11);


        Zoo zoo = new Zoo();
        zoo.animalInZoo(animal);
        zoo.animalInZoo(animal2);
        zoo.animalInZoo(animal3);
        zoo.animalInZoo(animal4);
        zoo.animalInZoo(animal5);
        zoo.printList();
        System.out.println("\n");

        zoo.printType("Penguin");
        zoo.printAverageAgeOfAnimalType("Lion");

    }
}
