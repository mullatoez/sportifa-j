package rest.path;

import ejb.StadiumEjbI;
import entity.Stadium;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/stadium")
public class StadiumApi {

    @EJB
    private StadiumEjbI stadiumEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Stadium> list() {
        return stadiumEjb.listAll();
    }
}
