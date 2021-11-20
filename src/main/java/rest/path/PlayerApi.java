package rest.path;

import ejb.PlayerEjbI;
import entity.Player;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/player")
public class PlayerApi {

    @EJB
    private PlayerEjbI playerEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> list() {
        return playerEjb.listAll();
    }
}
