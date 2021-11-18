package rest.path;

import ejb.LeagueEjbI;
import entity.League;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("league")
public class LeagueApi {

    @Inject
    private LeagueEjbI leagueEjb;

    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<League> list(){
        return leagueEjb.listAll();
    }
}
