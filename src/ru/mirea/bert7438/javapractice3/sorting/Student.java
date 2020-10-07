package ru.mirea.bert7438.javapractice3.sorting;

public class Student implements Comparable<Student>{
    private final int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.iDNumber, o.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                '}';
    }
}
