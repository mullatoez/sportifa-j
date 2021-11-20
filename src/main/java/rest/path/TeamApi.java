package rest.path;

import ejb.TeamEjbI;
import entity.Team;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/team")
public class TeamApi {

    @EJB
    private TeamEjbI teamEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Team> list() {
        return teamEjb.listAll();
    }
}
