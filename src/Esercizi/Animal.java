package Esercizi;

public class Animal {
    private String name;
    private String color;
    private String type;
    private int age;

    public Animal() {}
    public Animal(String name, String color, String type, Integer age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName()
                + " Color: " + this.getColor()
                + " Type: " + this.getType()
                + " Age: " + this.getAge();
    }
}
