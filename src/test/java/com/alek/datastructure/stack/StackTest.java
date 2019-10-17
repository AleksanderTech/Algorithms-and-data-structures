package com.alek.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack(5);
        stack.push(1);
    }

    @Test
    public void peek_shouldGetTopElement_whenElementExistsInStack() {

        assertEquals(1, stack.peek());
    }

    @Test
    public void peek_shouldThrowRuntimeException_whenElementDoesNotExistInStack() {

        assertThrows(RuntimeException.class, () -> stack.peek());
    }

    @Test
    public void push_shouldAddItem_whenStackIsNotFull() {

        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void push_shouldThrowRuntimeException_whenStackIsFull() {

        Stack stack = new Stack(1);
        stack.push(1);
        assertThrows(RuntimeException.class, () -> stack.push(2));
    }

    @Test
    public void pop_shouldRemoveItem_whenStackIsNotEmpty() {

        stack.push(2);
        stack.pop();
        assertEquals(1, stack.peek());
    }
}
