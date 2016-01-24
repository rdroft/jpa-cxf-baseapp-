package org.droft.proto.appmanager.ep;

import org.droft.proto.appmanager.dm.User;
import org.droft.proto.appmanager.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by roland on 23/01/2016.
 */
@Component
@Path("/")
@Produces("application/json")
@Consumes("application/json")
public class VersionResource {
    @Autowired
    @Qualifier("AppUsersRepo")
    UsersRepository usersRepository;

    @GET
    public String[] getApplicationVersion(){
        User u = new User();
        u.setName("user: "+(System.currentTimeMillis()/1000));
        u.setEmail(u.getName()+"@email.com");
        usersRepository.saveAndFlush(u);
        return new String[]{"test app", "hibernate 5","spring 4","cxf 3.1.4 (rest services)","jersey(rest services)","jpa 2.1"};
    }

    @GET
    @Path("users")
    public List<User> getUserList(){
      return  usersRepository.findAll();
    }
}
