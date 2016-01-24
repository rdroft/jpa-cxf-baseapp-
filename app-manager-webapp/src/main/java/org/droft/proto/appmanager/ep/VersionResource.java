package org.droft.proto.appmanager.ep;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by roland on 23/01/2016.
 */
@Component
@Path("/")
@Produces("application/json")
@Consumes("application/json")
public class VersionResource {
    @GET
    public String[] getApplicationVersion(){
        return new String[]{"test app", "hibernate 5","spring 4","cxf 3.1.4 (rest services)","jersey(rest services)","jpa 2.1"};
    }
}
