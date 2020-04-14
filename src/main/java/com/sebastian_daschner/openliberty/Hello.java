package com.sebastian_daschner.openliberty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hello {

    public String hello() {
        return "Hello";
    }

    public String hi() {
        return "Hi";
    }

}

