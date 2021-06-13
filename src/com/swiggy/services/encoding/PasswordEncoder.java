package com.swiggy.services.encoding;

public interface PasswordEncoder {
    String encode(String password, String username);
}


