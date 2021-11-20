package rest.path;

import ejb.ManagerEjbI;
import ejb.MatchEjbI;
import entity.Match;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/match")
public class MatchApi {

    @EJB
    private MatchEjbI matchEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> list(){
        return matchEjb.listAll();
    }
}
