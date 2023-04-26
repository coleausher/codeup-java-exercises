package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // methods for grades property
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void clearGrades() {
        this.grades.clear();
    }

    public double getAverageGrade() {
        if (grades.size() == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}




