package rest.path;

import ejb.ManagerEjbI;
import entity.Manager;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/manager")
public class ManagerApi {

    @EJB
    private ManagerEjbI managerEjb;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manager> list() {
        return managerEjb.listAll();
    }
}
