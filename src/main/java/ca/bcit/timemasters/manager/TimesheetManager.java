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
    @Inject
    ProjectManager projectManager;
    @Inject
    WorkPackageManager workPackageManager;
    @Inject
    TimesheetClient timesheetClient;

    private List<TimesheetBean> timesheets;

    public TimesheetManager() {

    }

    public TimesheetBean[] getTimesheets() {
        return timesheetClient.getAllForEmployee(employeeManager.getCurrentUser());
    }

    public TimesheetRowBean[] getTimesheetRowsForProject(int projectId) {
        return timesheetClient.getAllForProject(projectManager.getCurrentProject());
    }

    public TimesheetRowBean[] getTimesheetRowsForWorkPackage(int workPackageId) {
        return timesheetClient.getAllForWorkPackage(workPackageManager.getCurrentWorkPackage());
    }
    
}
