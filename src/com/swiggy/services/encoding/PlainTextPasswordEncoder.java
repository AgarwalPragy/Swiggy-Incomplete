package com.swiggy.services.encoding;

public class PlainTextPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String password, String username) {
        print("CAUTION! DO NOT USE IN PRODUCTION")
        return password;
    }
}
