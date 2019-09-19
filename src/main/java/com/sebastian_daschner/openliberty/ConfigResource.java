package com.sebastian_daschner.openliberty;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("config")
public class ConfigResource {

    @Inject
    @ConfigProperty(name = "greeting")
    String greeting;

    @GET
    public String getConfig() {
        return greeting;
    }

}
