package encapsulation;

import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Double> grades = new ArrayList<>();

    // Getter and Setter for student_id
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    // Getter and Setter for student_name
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    // Method to add grade with validation
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully");
        } else {
            System.out.println("Error: Grade must be between 0 and 100");
        }
    }

    // Method to get all grades
    public ArrayList<Double> getGrades() {
        return grades;
    }

    // Method to calculate average
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
}