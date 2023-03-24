package javaoop.exercise._2;


import java.util.concurrent.TimeUnit;

public class Student {
    String name;
    int age;

    public Student(String name, Integer age) throws InterruptedException {
        System.out.println("Constructing!");
        TimeUnit.MILLISECONDS.sleep(200);
        this.name = name;
        this.age = age;
        System.out.println("name= " + name + " age= " + age);
        System.out.println("Constructed!");
    }
    public Student() {
        System.out.println("vuoto!");
    }
    public Student(String name) {
        this.name = name;
        System.out.println("name= " + name);
    }
    public Student(Integer age) {
        this.age = age;
        System.out.println("age= " + age);
    }
}
