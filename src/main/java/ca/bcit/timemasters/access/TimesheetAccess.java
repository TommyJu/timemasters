//package ca.bcit.timemasters.access;
//
//import ca.bcit.timemasters.model.EmployeeBean;
//import ca.bcit.timemasters.model.TimesheetBean;
//import ca.bcit.timemasters.model.TimesheetRowBean;
//import jakarta.annotation.Resource;
//import jakarta.enterprise.context.Dependent;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.MediaType;
//import javax.sql.DataSource;
//
//@Dependent
//@Path("/timesheet")
//public class TimesheetAccess {
//    @PersistenceContext(unitName="timemaster-jpa")
//    EntityManager em;
//    private DataSource dataSource;
//
//    @GET
//    @Path("/find/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public TimesheetBean find(@PathParam("id") int id) {
//        return null;
//    }
//
//    @DELETE
//    @Path("/remove/{id}")
//    public void remove(@PathParam("id") int id) {
//
//    }
//
//    @GET
//    @Path("/employee/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public TimesheetBean[] getAllForEmployee(@PathParam("id") int id) {
//        return null;
//    }
//
//    @GET
//    @Path("/workpackage/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public TimesheetBean[] getAllForWorkPackage(@PathParam("id") int id) {
//        return null;
//    }
//
//    @GET
//    @Path("/project/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public TimesheetBean[] getAllForProject(@PathParam("id") int id) {
//        return null;
//    }
//
//    @PUT
//    @Path("/persist-timesheet/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void persist(TimesheetBean bean) {
//
//    }
//
//    @PUT
//    @Path("/persist-row/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void persist(TimesheetRowBean bean) {
//
//    }
//
//    @PUT
//    @Path("/merge-timesheet/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void merge(TimesheetBean bean) {
//
//    }
//
//    @PUT
//    @Path("/merge-row/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void merge(TimesheetRowBean bean) {
//
//    }
//
//
//
//}
