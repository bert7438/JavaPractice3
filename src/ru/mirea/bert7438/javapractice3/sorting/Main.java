package ru.mirea.bert7438.javapractice3.sorting;

public class Main {
    public static void sortID(int n){
        Student[] studentArray = new Student[n];
        for (int i = 0; i < n; i++)
            studentArray[i] = new Student((int)(Math.random() * 10000));


        for (int left = 0; left < studentArray.length; left++) {
            int minInd = left;
            for (int i = left; i < studentArray.length; i++) {
                if (studentArray[i].compareTo(studentArray[minInd]) < 0) {
                    minInd = i;
                }
            }
            //swap(studentArray, left, minInd);
            Student buf = studentArray[left];
            studentArray[left] = studentArray[minInd];
            studentArray[minInd] = buf;
        }
        for(int i = 0; i < n; i++)
            System.out.println(studentArray[i]);
    }

    public static void main(String[] args) {
        sortID(100);
    }
}
