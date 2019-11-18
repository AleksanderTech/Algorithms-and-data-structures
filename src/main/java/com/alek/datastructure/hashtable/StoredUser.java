package com.alek.datastructure.hashtable;

import com.alek.model.User;

public class StoredUser {

    public String key;
    public User user;

    public StoredUser(String key, User user) {
        this.key = key;
        this.user = user;
    }
}
