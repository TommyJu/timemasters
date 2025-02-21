package ca.bcit.timemasters.client;

import ca.bcit.timemasters.model.*;
import jakarta.enterprise.context.Dependent;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;

import java.io.Serializable;

@Dependent
public class TimesheetClient implements Serializable {
    ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();

    String baseURI = ex.getRequestScheme() + "://"
            + ex.getRequestServerName() + ":"
            + ex.getRequestServerPort()
            + ex.getRequestContextPath()
            + "/api";

    public TimesheetBean find(int id) {
        return null;
    }

    public TimesheetBean[] getAllForEmployee(EmployeeBean employee) {
        return null;
    }

    public TimesheetRowBean[] getAllForWorkPackage(WorkPackageBean workPackage) {
        return null;
    }

    public TimesheetRowBean[] getAllForProject(ProjectBean project) {
        return null;
    }

    public void persist(TimesheetBean timesheet) {

    }

    public void persist(TimesheetRowBean tsrb) {

    }

    public void merge(TimesheetBean timesheet) {

    }

    public void merge(TimesheetRowBean tsrb) {

    }

    public void remove(TimesheetBean timesheet) {

    }

    public void remove(TimesheetRowBean tsrb) {

    }


}
