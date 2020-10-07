package ru.mirea.bert7438.javapractice3.recursion;

public class Recursion {
    public static void triangle(int num) {
        if (num == 1)
            System.out.println(1);
        else {
            for (int i = 0; i < num; i++)
                System.out.println(num);
            triangle(num - 1);
        }

    }

    public static void range(int num) {
        if (num == 1) {
            System.out.println(1);
        } else {
            System.out.println(num);
            range(num - 1);
        }
    }

    public static void enumerAB(int a, int b) {
        if (a <= b) {
            if (a == b)
                System.out.println(b);
            else {
                System.out.println(a);
                enumerAB(a + 1, b);
            }
        } else {
            if (a == b+1) {
                System.out.println(b+1);
                System.out.println(b);
            } else {
                System.out.println(a);
                enumerAB(a-1, b);
            }
        }
    }


    public static void main(String[] args) {
        triangle(5);
        range(5);
        enumerAB(5,2);
    }
}
