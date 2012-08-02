package net.kuronicle.jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN) // "text/plain"
    public String sayHello() {
        return "Hello World!";
    }
    
}
