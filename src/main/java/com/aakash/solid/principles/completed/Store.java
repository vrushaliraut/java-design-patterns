package com.aakash.solid.principles.completed;

import java.util.HashMap;
import java.util.Map;

public class Store implements UserRepository {

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
    @Override
    public User getUser(String email) {
        User user;
        synchronized (Store.class) {
            user = STORAGE.get(email);
        }
        return user;
    }
}
