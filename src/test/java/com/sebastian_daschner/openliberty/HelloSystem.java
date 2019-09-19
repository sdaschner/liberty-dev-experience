package com.sebastian_daschner.openliberty;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class HelloSystem {

    private final Client client;
    private final WebTarget baseTarget;

    public HelloSystem() {
        client = ClientBuilder.newClient();
        baseTarget = client.target(buildUri());
    }

    private URI buildUri() {
        String host = System.getProperty("hello.test.host", "localhost");
        String port = System.getProperty("hello.test.port", "9080");
        return UriBuilder.fromUri("http://{host}:{port}/hello/").build(host, port);
    }

    public String getGreeting(String greeting) {
        return getResponse(baseTarget.path("greetings").path(greeting));
    }

    public String getConfig() {
        return getResponse(baseTarget.path("config"));
    }

    private String getResponse(WebTarget target) {
        Response response = target.request().get();
        verifySuccess(response);
        return response.readEntity(String.class);
    }

    private void verifySuccess(Response response) {
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL)
            throw new AssertionError("Status was not successful: " + response.getStatus());
    }
}
