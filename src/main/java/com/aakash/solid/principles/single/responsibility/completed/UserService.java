package com.aakash.solid.principles.single.responsibility.completed;

public class UserService {

    // Store class is responsible for storing and getting the user
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String storeUser(User user) {
        userRepository.store(user);
        return "User created successfully";
    }
}
