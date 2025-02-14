package ca.bcit.timemasters.manager;

import ca.bcit.timemasters.client.TimesheetClient;
import ca.bcit.timemasters.model.TimesheetBean;
import ca.bcit.timemasters.model.TimesheetRowBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class TimesheetManager implements Serializable {
    @Inject
    EmployeeManager employeeManager;
    List<TimesheetBean> timesheets;
    TimesheetClient timesheetClient;

    public TimesheetBean[] getTimesheets() {
        return null;
    }

    public TimesheetRowBean[] getTimesheetRowsForProject(int projectId) {
        return null;
    }

    public TimesheetRowBean[] getTimesheetRowsForWorkPackage(int workPackageId) {
        return null;
    }
    
}
