package com.aakash.solid.principles.single.responsibility.completed;

public interface UserRepository {
    void store(User user);

    User getUser(String email);
}
