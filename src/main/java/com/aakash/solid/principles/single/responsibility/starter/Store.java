package com.aakash.solid.principles.single.responsibility.starter;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    /**
     * This method is responsible for storing the user.
     * @param user the user to store
     */
    public void store(User user) {
        synchronized (Store.class) {
            STORAGE.put(user.getEmail(), user);
        }
    }

    /**
     * This method is responsible for getting the user.
     * @param email the email of the user
     */
    public void getUser(String email) {
        synchronized (Store.class) {
            STORAGE.get(email);
        }
    }
}
