package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.WorkPackageBean;

import jakarta.annotation.Resource;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import javax.sql.DataSource;

public class WorkPackageAccess {
    @Resource(mappedName = "java:jboss/datasources/timemasters")
    private DataSource dataSource;

    @GET
    @Path("/workpackage/find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public WorkPackageBean find(@PathParam("id") int workpackageId) {
        return null;
    }

    @DELETE
    @Path("/workpackage/remove/{id}")
    public void remove(@PathParam("id") int workpackageId) {
        // remove WP
    }

    @POST
    @Path("/workpackage/persist")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(WorkPackageBean workpackage) {
        // insert WP
    }

    @PUT
    @Path("/workpackage/merge")
    @Consumes(MediaType.APPLICATION_JSON)
    public void merge(WorkPackageBean workpackage) {
        // merge WP
    }

    @GET
    @Path("/workpackage/all-by-project/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public WorkPackageBean[] getAllByProject(@PathParam("id") int projectId) {
        return null;
    }

    @GET
    @Path("/workpackage/all-by-employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public WorkPackageBean[] getAllByEmployee(@PathParam("id") int employeeId) {
        return null;
    }
}
