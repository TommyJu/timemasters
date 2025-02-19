package ca.bcit.timemasters.manager;

import ca.bcit.timemasters.client.ProjectClient;
import ca.bcit.timemasters.model.ProjectBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@SessionScoped
@Named
public class ProjectManager implements Serializable {
    @Inject
    private EmployeeManager employeeManager;

    @Inject
    private TimesheetManager timesheetManager;

    @Inject
    private WorkPackageManager workPackageManager;
    private ProjectClient projectClient;

    private ProjectBean currentProject;

    public ProjectBean getCurrentProject() {
        return currentProject;
    }
}
