package exercise_2

fun main() {
    val animals = Inheritance.inheritanceAnimal()
    val dog = Inheritance.Dog()
    val cat = Inheritance.Cat()

    animals.sayHello()
    dog.sayHello()
    cat.sayHello()

    val animals2 = Interfaces.interfacesAnimal()
    val dog2 = Interfaces.Dog()
    val cat2 = Interfaces.Cat()

    animals2.sayHello()
    dog2.sayHello()
    cat2.sayHello()
}