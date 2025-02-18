package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.EmployeeBean;

import jakarta.annotation.Resource;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import javax.sql.DataSource;

public class EmployeeAccess {
    @Resource(mappedName = "java:jboss/datasources/timemasters")
    private DataSource dataSource;

    @GET
    @Path("/employee/find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean find(@PathParam("id") int employeeId) {
        return null;
    }

    @DELETE
    @Path("/employee/delete/{id}")
    public void remove(@PathParam("id") int employeeId) {
        // remove employee
    }

    @POST
    @Path("/employee/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(EmployeeBean employee) {
        // insert employee
    }

    @PUT
    @Path("/employee/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public void merge(EmployeeBean employee) {
        // merge employee
    }

    @GET
    @Path("/employee/all")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean[] getAll() {
        return null;
    }
}
