package org.acme.spring.security;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/{user}")
    @Produces(MediaType.TEXT_PLAIN)
    @PreAuthorize("@personChecker.check(#user)")
    public String helloUser(@PathParam("user") String user) {
        return "Hello " + user + "!";
    }
}
