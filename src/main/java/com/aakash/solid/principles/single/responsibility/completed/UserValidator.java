package com.aakash.solid.principles.single.responsibility.completed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    /**
     * This method is responsible for checking if the user is valid.
     * @param user the user to check
     * @return true if the user is valid, false otherwise
     */
    public boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            return false;
        }
        user.setEmail(user.getEmail().trim());

        return isValidEmail(user.getEmail());
    }

    /**
     * This method is responsible for checking if the value is present.
     * @param value the value to check
     * @return true if the value is present, false otherwise
     */
    public boolean isPresent(String value) {
        return value != null && !value.trim().isEmpty();
    }

    /**
     * This method is responsible for checking if the value is valid alphanumeric.
     * @param value the value to check
     * @return true if the value is valid alphanumeric, false otherwise
     */
    public boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }

    /**
     * This method is responsible for checking if the value is valid email.
     * @param value the value to check
     * @return true if the value is valid email, false otherwise
     */
    public boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
}
