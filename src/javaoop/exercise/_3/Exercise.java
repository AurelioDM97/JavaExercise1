package javaoop.exercise._3;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:\n");

        Student student = new Student();

        student.setName("Aurelio");
        student.getName();

        student.setAge(26);
        student.getAge();

        student.setEmail("aurelio@gmail.com");
        student.getEmail();

        student.setClassSection("A");
        System.out.println("Class section: " + student.getClassSection());

        student.setSubject("Computer Science");
        System.out.println("Class subject: " + student.getSubject());
        System.out.println(student.getNumbersOfTimesWeGotEmailAddress());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");


    }

}
