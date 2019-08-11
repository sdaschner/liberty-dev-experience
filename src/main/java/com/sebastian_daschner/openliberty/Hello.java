package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hello {

    @Counted(name = "greetings", tags = "greeting=formal")
    public String hello() {
        return "Hello";
    }

    @Counted(name = "greetings", tags = "greeting=casual")
    public String hi() {
        return "Hi";
    }

}
