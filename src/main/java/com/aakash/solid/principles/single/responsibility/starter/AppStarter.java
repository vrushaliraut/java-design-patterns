package com.aakash.solid.principles.single.responsibility.starter;

import java.io.IOException;

public class AppStarter {
    //A valid USER JSON String
    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";

    //Invalid USER JSON String - email format wrong
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    public static void main(String[] args) {
        UserController controller = new UserController();

        //Check with valid JSON
        String response = null;
        try {
            response = controller.createUser(VALID_USER_JSON);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }
        System.out.println("Valid JSON received response: "+response);

        //Check with invalid JSON
        try {
            response = controller.createUser(INVALID_USER_JSON);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(!response.equalsIgnoreCase("ERROR")) {
            System.err.println("Failed");
        }
        System.out.println("Invalid JSON received response: "+response);
    }
}
