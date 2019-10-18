package com.alek.datastructure.stack;

import java.util.EmptyStackException;

public class ArrayDynamicStack<E> implements Stack<E> {

    private Object[] stack;
    private int top;
    private int capacity;
    private final static int DEFAULT_CAPACITY = 10;

    public ArrayDynamicStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
        this.top = 0;
    }

    public ArrayDynamicStack() {
        this.capacity = ArrayDynamicStack.DEFAULT_CAPACITY;
        this.stack = new Object[capacity];
        this.top = 0;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = (E) stack[--top];
        stack[--top] = null;
        return item;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) stack[top - 1];
    }

    @Override
    public void push(E item) {
        if (isFull()) {
            resizeStack();
        }
        stack[top] = item;
        top++;
    }

    @Override
    public boolean isFull() {
        return top == stack.length;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    private void resizeStack() {
        capacity += capacity;
        Object[] newStack = new Object[capacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
