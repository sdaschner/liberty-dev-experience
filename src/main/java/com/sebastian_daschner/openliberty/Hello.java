package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hello {

    @Counted(name = "greetings_hello")
    public String hello() {
        return "Hello";
    }

    @CircuitBreaker
    public String hi() {
        return "Hi";
    }

}
