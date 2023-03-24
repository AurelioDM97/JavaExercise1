package javaoop.exercise._1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String studentsSkills;
    String objects;
    String courseName;
    int maxStudents;
    int qualityRatingOutOf10;
    List<Student> students = new ArrayList<>();

    public void averageCalculation() {
        double sum = 0;

        for (int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).age;
        }
        double totalAverage = sum / students.size();
        System.out.println("The average age of students are: " + totalAverage);
    }
}
