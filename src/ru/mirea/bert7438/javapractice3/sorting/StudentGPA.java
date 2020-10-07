package ru.mirea.bert7438.javapractice3.sorting;

public class StudentGPA implements Comparable<StudentGPA>{
    private double GPA;

    public StudentGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "StudentGPA{" +
                "GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(StudentGPA o) {
        return -Double.compare(this.GPA, o.GPA);
    }
}
