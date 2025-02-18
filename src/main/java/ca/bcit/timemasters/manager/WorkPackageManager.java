package ca.bcit.timemasters.manager;

import ca.bcit.timemasters.client.WorkPackageClient;
import ca.bcit.timemasters.model.WorkPackageBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@SessionScoped
@Named
public class WorkPackageManager implements Serializable {
    @Inject
    EmployeeManager employeeManager;
    @Inject
    TimesheetManager timesheetManager;
    @Inject
    WorkPackageClient workPackageClient;

    private WorkPackageBean currentWorkPackage;

    public WorkPackageBean getCurrentWorkPackage() {
        return currentWorkPackage;
    }

    public void setCurrentWorkPackage(WorkPackageBean currentWorkPackage) {
        this.currentWorkPackage = currentWorkPackage;
    }
}
