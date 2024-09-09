package com.aakash.solid.principles.starter;

public class User {

    private String name;
    private String email;
    private String address;

    public User(){}

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * This method is responsible for setting the name of the user.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method is responsible for getting the name of the user.
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is responsible for getting the email of the user.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method is responsible for setting the email of the user.
     * @param email the email of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method is responsible for getting the address of the user.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method is responsible for setting the address of the user.
     * @param address the address of the user
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method is responsible for getting the user details.
     * @return user details
     */
    public String getUserDetails() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
