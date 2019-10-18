package com.alek.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayFixedStackTest {

    private ArrayFixedStack arrayFixedStack;

    @BeforeEach
    public void setUp() {
        arrayFixedStack = new ArrayFixedStack(5);
        arrayFixedStack.push(1);
    }

    @Test
    public void peek_shouldGetTopElement_whenElementExistsInStack() {

        assertEquals(1, arrayFixedStack.peek());
    }

    @Test
    public void peek_shouldThrowRuntimeException_whenElementDoesNotExistInStack() {

        assertThrows(RuntimeException.class, () -> arrayFixedStack.peek());
    }

    @Test
    public void push_shouldAddItem_whenStackIsNotFull() {

        arrayFixedStack.push(2);
        assertEquals(2, arrayFixedStack.peek());
    }

    @Test
    public void push_shouldThrowRuntimeException_whenStackIsFull() {

        ArrayFixedStack arrayFixedStack = new ArrayFixedStack(1);
        arrayFixedStack.push(1);
        assertThrows(RuntimeException.class, () -> arrayFixedStack.push(2));
    }

    @Test
    public void pop_shouldRemoveItem_whenStackIsNotEmpty() {

        arrayFixedStack.push(2);
        arrayFixedStack.pop();
        assertEquals(1, arrayFixedStack.peek());
    }
}
