package com.jeantravassos.rest.webservice.objectivesssservice.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU4Njk4MTY2NywiaWF0IjoxNTg2Mzc2ODY3fQ.ScyI3sgWX0bUXKvQcrYkJa7YZZ-wmeRhTwM2mKPh0JbsjSJrG5fSPzN4Wso8lka_ucWQgCcz2pQsgmHlt2uXew"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
