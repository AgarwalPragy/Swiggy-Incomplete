package com.swiggy.models;

import java.util.List;

public class User extends Auditable {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String hashedSaltedPassword;
    @Getter
    @Setter
    private List<Role> roles;

    public User(String username, String hashedSaltedPassword) {
        this.username = username;
        this.hashedSaltedPassword = hashedSaltedPassword;
    }
}

