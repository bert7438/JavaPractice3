package ru.mirea.bert7438.javapractice3.list;

/**
 * WaitList with limited capacity
 *
 * @param <T> type of elements
 */
public class BoundedWaitList<T> extends WaitList<T> {
    private final int capacity;

    public int getCapacity() {
        return capacity;
    }

    /**
     * Tries to add element to the list. If size is greater then capacity, nothing is added
     *
     * @param element element to be added
     */
    @Override
    public void add(T element) {
        if (capacity > content.size())
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
}
