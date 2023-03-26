package javaoop.exercise._3;

public class Student {
    private String name;
    private int age;
    private int minStudentAge = 14;
    private String email;
    private String classSection;
    private String subject;
    private int numbersOfTimesWeGotEmailAddres = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!Character.isUpperCase(name.charAt(0))) {
            System.out.println("You need to capitalize the first letter of your name first");
        } else {
            System.out.println("Name: " + name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < minStudentAge) {
            System.out.println("You're too young to start this class!");
        } else {
            System.out.println("Age: " + age);
        }
    }

    public String getEmail() {
        numbersOfTimesWeGotEmailAddres = numbersOfTimesWeGotEmailAddres + 1;
        return this.email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Error: Try to put your e-mail address again!");
        } else {
            System.out.println("Email: " + email);
        }
        this.email = email;

    }

    public String getClassSection() {
        return classSection;
    }

    public void setClassSection(String classSection) {
        this.classSection = classSection;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getNumbersOfTimesWeGotEmailAddress() {
        return this.numbersOfTimesWeGotEmailAddres;
    }
}
