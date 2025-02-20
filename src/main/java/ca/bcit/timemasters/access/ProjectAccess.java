package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.ProjectBean;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import javax.sql.DataSource;

@Dependent
@Path("/project")
public class ProjectAccess {
    @Resource(mappedName = "java:jboss/datasources/TimeMasters")
    private DataSource dataSource;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProjectBean find(@PathParam("id") int id){
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void persist(ProjectBean project){
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void merge(ProjectBean project){
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") int id){

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProjectBean[] getAllForEmployee(int employeeId){
        return null;
    }
}
