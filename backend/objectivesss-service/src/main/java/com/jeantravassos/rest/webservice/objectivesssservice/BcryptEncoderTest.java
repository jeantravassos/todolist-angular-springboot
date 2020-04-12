package com.jeantravassos.rest.webservice.objectivesssservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode("NewSafePassword!");
        System.out.println(encoded);
    }
}
