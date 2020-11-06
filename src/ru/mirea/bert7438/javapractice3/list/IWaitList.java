package ru.mirea.bert7438.javapractice3.list;

import java.util.Collection;

/**
 * WaitList interface represents a waiting list.
 *
 * @param <T> the type of the elements of the List
 * @author bert7438
 */
public interface IWaitList<T> {

    /**
     * adds element in the list
     *
     * @param element element which needs to be added
     */
    void add(T element);

    /**
     * deletes element in the list
     *
     * @return the element which will be deleted
     */
    T remove();

    /**
     * Checks if the element is in the list
     *
     * @param element element which needs to be checked to exist in the list
     * @return true if element is in the list; false otherwise
     */
    boolean contains(T element);

    /**
     * Checks if all elements of collection c are in the list.
     *
     * @param c collection of elements which needs to be checked to exist in the list
     * @return true if all elements are in the list; false otherwise
     */
    boolean containsAll(Collection<T> c);

    /**
     * Checks if there are no elements in the list.
     *
     * @return true if list is empty; false otherwise
     */
    boolean isEmpty();
}
