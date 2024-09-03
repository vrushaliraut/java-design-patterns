package com.aakash.solid.principles.single.responsibility.completed;

public class AdminUser extends User implements Permission, Profile {
    String profile;
    String permission;

    @Override
    public void setPermission() {

    }

    @Override
    public void setProfile() {

    }
}
