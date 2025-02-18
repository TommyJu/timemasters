package ca.bcit.timemasters.manager;

import java.util.List;
import ca.bcit.timemasters.model.EmployeeBean;
import jakarta.enterprise.context.SessionScoped;
import ca.bcit.timemasters.client.EmployeeClient;

import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.inject.Inject;

@SessionScoped
@Named
public class EmployeeManager implements Serializable {
    @Inject
    private EmployeeClient employeeClient;
    
    private EmployeeBean currentUser;
    private List<EmployeeBean> employees;

    public EmployeeBean getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(EmployeeBean currentUser) {
        this.currentUser = currentUser;
    }

    public List<EmployeeBean> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeBean> employees) {
        this.employees = employees;
    }

    public EmployeeClient getEmployeeClient() {
        return employeeClient;
    }

    public void setEmployeeClient(EmployeeClient employeeClient) {
        this.employeeClient = employeeClient;
    }
} // end of class
