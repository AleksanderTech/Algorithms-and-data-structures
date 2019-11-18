package com.alek.datastructure.hashtable;

import com.alek.model.User;

public class ArrayHashTable {

    private int size;
    private StoredUser[] hashTable;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayHashTable() {
        this.hashTable = new StoredUser[DEFAULT_CAPACITY];
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
            hashTable[hashedKey] = new StoredUser(key, user);
            this.size++;
        }
    }

    public User get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].user;
    }

    private int findKey(String key) {

        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return this.hashTable[index] != null;
    }

    public int size() {
        return this.size;
    }
}
