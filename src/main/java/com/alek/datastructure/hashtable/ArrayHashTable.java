package com.alek.datastructure.hashtable;

import com.alek.model.User;

public class ArrayHashTable {

    private int size;
    private User[] hashTable;

    public ArrayHashTable() {
        this.hashTable = new User[2];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, User user) {

        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        if (occupied(hashedKey)) {
            System.out.println("This slot is already taken: " + key);
        } else {
            hashTable[hashedKey] = user;
            this.size++;
        }
    }

    public User getValue(String key) {
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    private boolean occupied(int index) {
        return this.hashTable[index] != null;
    }

    public int size() {
        return this.size;
    }
}
