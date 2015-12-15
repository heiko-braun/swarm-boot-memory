package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Heiko Braun
 * @since 15/12/15
 */
@Path("/")
public class DemoResource {

    @GET
    @Produces("application/json")
    public Greeting greeting() {
        return new Greeting("Hello World!");
    }
}