package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.EmployeeBean;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/employee")
public class EmployeeAccess {
    @Inject 
    EntityManager em;
    private DataSource dataSource;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean find(@PathParam("id") int employeeId) {
        return null;
    }

    @DELETE
    @Path("/remove/{id}")
    public void remove(@PathParam("id") int employeeId) {
        // remove employee

    }

    @POST
    @Path("/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(EmployeeBean employee) {
        // insert employee
    }

    @PUT
    @Path("/merge")
    @Consumes(MediaType.APPLICATION_JSON)
    public void merge(EmployeeBean employee) {
        // merge employee
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean[] getAll() {
        List<EmployeeBean> employees = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement()){
            ResultSet result = (ResultSet) stmt
                    .executeQuery("SELECT * FROM employee");
            while (result.next()) {
                EmployeeBean newEmployee = new EmployeeBean();
                newEmployee.setEmployeeId(result.getLong("id"));
                newEmployee.setFirstName(result.getString("first_name"));
                newEmployee.setLastName(result.getString("last_name"));
                employees.add(newEmployee);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return employees.toArray(new EmployeeBean[0]);

    }
}
