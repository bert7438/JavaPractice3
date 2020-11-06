package ru.mirea.bert7438.javapractice3.list;

public class Main {
    public static void checkBwl(int size){
        BoundedWaitList<Integer> bwl = new BoundedWaitList<>(size);
        for (int i = 0; i < size; i++) {
            bwl.add(i);
        }
        bwl.add(99999);
        System.out.println(bwl);
        System.out.println("Contains 5? " + bwl.contains(5));
    }

    public static void checkUwl(int size){
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        for (int i = 0; i < size; i++){
            uwl.add(i);
        }
        System.out.println(uwl);
        uwl.remove(2);
        uwl.remove(0);
        uwl.moveToBack(1);
        System.out.println(uwl);
    }

    public static void main(String[] args) {
        checkBwl(6);
        checkUwl(6);
    }
}
