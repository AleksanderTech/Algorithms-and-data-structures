package com.alek.datastructure.hashtable;

import com.alek.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayHashTableTest {

    private ArrayHashTable hashTable;
    private User user;

    @BeforeEach
    public void setUp() {
        this.hashTable = new ArrayHashTable();
        this.user = new User("login", "password");
    }

    @Test
    public void shouldReturnValue_whenAccessViaKey() {

        hashTable.put("user", user);
        User actual = hashTable.getValue("user");
        assertEquals(user, actual);
    }

    @Test
    public void shouldAddUser_whenKeyIsAlreadyTaken() {

        hashTable.put("user", user);
        hashTable.put("user", user);

        assertEquals(2, hashTable.size());
    }
}