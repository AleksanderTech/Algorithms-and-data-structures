package com.alek.datastructure.stack;

public interface Stack<T> {

    T pop();

    T peek();

    void push(T item);

    boolean isFull();

    boolean isEmpty();

    int size();
}
