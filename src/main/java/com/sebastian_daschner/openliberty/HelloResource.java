package com.sebastian_daschner.openliberty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetings")
public class HelloResource {

    @Inject
    Hello hello;

    @GET
    @Path("hello")
    public String hello() {
        return hello.hello();
    }

    @GET
    @Path("hi")
    public String hi() {
        return hello.hi();
    }

}
