package ru.mirea.bert7438.javapractice3.list;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * WaitList with the ability to remove items which are not in the beginning and to move item to the end.
 *
 * @param <T> type of elements
 */
public class UnfairWaitList<T> extends WaitList<T> {
    public UnfairWaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Removes element from the list if it is not in the beginning
     *
     * @param element element to be removed
     */
    public void remove(T element) {
        int index = 0;
        boolean pass = false;
        for (T el : content) {
            if (el.equals(element)) {
                pass = true;
                break;
            }
            index++;
        }
        if (index != 0 && pass)
            content.remove(content.toArray()[index]);
    }

    /**
     * Moves element to the end of the list.
     *
     * @param element element to be moved to the end of the list
     */
    public void moveToBack(T element) {
        remove(element);
        add(element);
    }
}
