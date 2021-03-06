package com.alek.datastructure.stack;

public class ArrayFixedStack {

    private int top;
    private int capacity;
    private int[] array;

    public ArrayFixedStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {

        top++;
        if (isFull()) {
            throw new RuntimeException("ArrayFixedStack is full");
        }
        array[top] = item;
    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("ArrayFixedStack is empty");
        }
        return array[top--];
    }

    public int peek() {

        if (isEmpty()) {
            throw new RuntimeException("ArrayFixedStack is empty");
        }
        return array[top];
    }

    public boolean isFull() {

        return top >= capacity;
    }

    public boolean isEmpty() {

        return top == -1;
    }
}
