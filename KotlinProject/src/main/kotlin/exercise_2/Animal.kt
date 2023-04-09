package exercise_2

class Inheritance{
    open class inheritanceAnimal { //classe padre
        open fun sayHello() {
            println("We are animals!")
        }
    }
    class Dog : inheritanceAnimal() { //classe figlia
        override fun sayHello() {
            println("I'm a dog")
        }                                   //la classe Dog e Cat ereditano dalla classe padre
    }
    class Cat : inheritanceAnimal() { //classe figlia
        override fun sayHello() {
            println("I'm a cat")
        }
    }
}
class Interfaces {
    open class interfacesAnimal : Presentation { // classe padre che richiama un'interfaccia
        override fun sayHello() {
            println("We are animals!")
        }
    }
    class Dog :Presentation { //classe figlia che richiama un'interfaccia
        override fun sayHello() {
            println("Hello I'm an interface dog")
        }
    }
    class Cat : Presentation { //classe figlia che richiama un interfaccia
        override fun sayHello() {
            println("Hello I'm an interface cat")
        }
    }
    interface Presentation { //interface che contiene una semplice implementazione
        fun sayHello()
    }
}