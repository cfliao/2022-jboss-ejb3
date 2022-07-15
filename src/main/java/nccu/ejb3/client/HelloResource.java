package nccu.ejb3.client;

import nccu.Hello;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {

    @EJB // Can not use @Inject as this is a Remote interface
    private Hello hello;

    @GET
    @Produces("text/plain")
    public String hello() {
        return hello.doHello("Test1-");
    }
}