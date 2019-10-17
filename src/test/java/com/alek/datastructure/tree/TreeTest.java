package com.alek.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {

    private Tree tree;
    private final int notExistingValue = -1;
    private final int minimumValue = 1;
    private final int maximumValue = 9;

    @BeforeEach
    public void setUp() {

        tree = new Tree();
        tree.insert(8);
        tree.insert(2);
        tree.insert(6);
        tree.insert(maximumValue);
        tree.insert(minimumValue);
    }

    @Test
    public void get_shouldReturnInsertedValue() {

        int insertedValue = 1;
        tree.insert(insertedValue);
        assertEquals(insertedValue, tree.get(insertedValue).getData());
    }

    @Test
    public void get_shouldReturnNull_whenValueDoesNotExistInTree() {

        assertEquals(null, tree.get(notExistingValue));
    }

    @Test
    public void min_shouldReturnMinimumValue() {

        assertEquals(minimumValue, tree.min().getData());
    }

    @Test
    public void max_shouldReturnMaximumValue() {

        assertEquals(maximumValue, tree.max().getData());
    }

    @Test
    public void delete_shouldDeleteExistingValue() {

        tree.delete(9);
        assertEquals(null, tree.get(9));
    }
}