package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hello {

    @Counted(name = "hellos_total")
    public String hello() {
        return "Hello";
    }

    public String hi() {
        return "Hi";
    }

}
