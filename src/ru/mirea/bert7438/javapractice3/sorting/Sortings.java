package ru.mirea.bert7438.javapractice3.sorting;

import java.util.Arrays;

public class Sortings {
    public static Student[] sortID(Student[] array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i].compareTo(array[minInd]) < 0) {
                    minInd = i;
                }
            }
            //swap(studentArray, left, minInd);
            Student buf = array[left];
            array[left] = array[minInd];
            array[minInd] = buf;
        }
        return array;
    }

    public static void quickSort(StudentGPA[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        StudentGPA opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(opora) < 0)
                i++;

            while (array[j].compareTo(opora) > 0)
                j--;

            if (i <= j) {
                StudentGPA temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static Student[] mergeArrays(Student[] a1, Student[] a2) {
        Student[] b = new Student[a1.length + a2.length];
        Sortings.sortID(a1);
        Sortings.sortID(a2);

        int positionA1 = 0;
        int positionA2 = 0;

        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
            } else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
            } else if(a1[positionA1].compareTo(a2[positionA2]) < 0){
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }


}
