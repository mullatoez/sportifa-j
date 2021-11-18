package rest.path;

import dao.LeagueDao;
import ejb.LeagueEjbI;
import entity.League;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/league")
public class LeagueApi {

    @EJB
    private LeagueEjbI leagueEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<League> list(){
        return leagueEjb.listAll();
    }
}
