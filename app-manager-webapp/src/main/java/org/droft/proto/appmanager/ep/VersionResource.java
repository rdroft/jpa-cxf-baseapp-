package org.droft.proto.appmanager.ep;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by roland on 23/01/2016.
 */
@Component
@Path("/")
public class VersionResource {

    @GET
    @Produces("application/json")
    public String[] getApplicationVersion(){
        return new String[]{"1.0.0","2,22"};
    }
}
