package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetings")
public class HelloResource {

    @GET
    @Path("hello")
    @Counted(name = "greetings", tags = "greeting=formal")
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("hi")
    @Counted(name = "greetings", tags = "greeting=casual")
    public String hi() {
        return "Hi!";
    }

}
