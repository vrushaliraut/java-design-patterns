package com.aakash.solid.principles.single.responsibility.completed;

import java.io.IOException;

public class UserController {
    private final UserValidator userValidator;
    private final UserMapper userMapper;
    private final UserService userService;

    public UserController(UserValidator userValidator, UserMapper userMapper, UserService userService) {
        this.userValidator = userValidator;
        this.userMapper = userMapper;
        this.userService = userService;
    }

    /**
     * This method is responsible for validating the user.
     *
     * @param userJson Json for user to validate
     * @return Success if the user is valid, Error otherwise
     */
    public String createUser(String userJson) throws IOException {
        User user = userMapper.mapToUser(userJson);
        if (!userValidator.isValidUser(user)) {
            return "Invalid user";
        }
       return userService.storeUser(user);
    }
}
