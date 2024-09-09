package com.aakash.solid.principles.completed;

public interface UserRepository {
    void store(User user);

    User getUser(String email);
}
