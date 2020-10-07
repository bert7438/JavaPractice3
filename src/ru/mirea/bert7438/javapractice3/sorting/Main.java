package ru.mirea.bert7438.javapractice3.sorting;

public class Main {
    public static void sortID(int n){
        Student[] studentArray = new Student[n];
        for (int i = 0; i < n; i++)
            studentArray[i] = new Student((int)(Math.random() * 10000));

        Sortings.sortID(studentArray);
        for(int i = 0; i < n; i++)
            System.out.println(studentArray[i]);
    }

    public static void sortGPA(int n){
        StudentGPA[] students = new StudentGPA[n];
        for(int i = 0; i<n; i++)
            students[i] = new StudentGPA(Math.random() * 5);

        Sortings.quickSort(students, 0, students.length-1);
        for(int i = 0; i < n; i++)
            System.out.println(students[i]);
    }

    public static void main(String[] args) {
        //sortID(100);
        sortGPA(100);
    }
}
