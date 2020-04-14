package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("config")
public class ConfigResources {

    @Inject
    @ConfigProperty(name = "greeting")
    String greetings;

    @GET
    public String config() {
        return greetings;
    }

}
