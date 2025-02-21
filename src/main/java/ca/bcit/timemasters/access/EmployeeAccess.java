package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.EmployeeBean;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

    @Inject
    private DataSource dataSource;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean find(@PathParam("id") int employeeId) {
        return em.find(EmployeeBean.class, employeeId);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") int employeeId) {
        em.remove(em.find(EmployeeBean.class, employeeId));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(EmployeeBean employee) {
        em.persist(employee);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void merge(EmployeeBean employee) {
        em.merge(employee);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeBean[] getAll() {
        TypedQuery<EmployeeBean> query =  em.createQuery("SELECT e from EmployeeBean e", EmployeeBean.class);
        List<EmployeeBean> employees = query.getResultList();
        return employees.toArray(new EmployeeBean[employees.size()]);
    }
}
