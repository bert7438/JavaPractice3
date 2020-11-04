package ru.mirea.bert7438.javapractice3.list;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T>{
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
}
