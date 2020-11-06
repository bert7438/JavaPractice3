package ru.mirea.bert7438.javapractice3.list;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * WaitList is an implementation of IWaitList interface based on {@link ConcurrentLinkedQueue}
 *
 * @param <T> type of elements
 */

public class WaitList<T> implements IWaitList<T> {
    protected ConcurrentLinkedQueue<T> content;

    @Override
    public void add(T element) {
        content.add(element);
    }

    @Override
    public T remove() {
        return content.poll();
    }

    @Override
    public boolean contains(T element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList() {
    }

    public WaitList(ConcurrentLinkedQueue<T> c) {
        this.content = c;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
