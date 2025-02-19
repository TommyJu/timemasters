package ca.bcit.timemasters.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ca.bcit.timemasters.model.EmployeeBean;
import jakarta.annotation.PostConstruct;
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
    private List<EmployeeBean> employees = new ArrayList<>();
    
    //For password changing field
    private String tempPassword;

    @PostConstruct
    public void init() {
        // Initialize the list of employees
        Collections.addAll(employees, employeeClient.getAll());
    };

    // START: Methods

    public void persistEmployee(EmployeeBean employee) {
        employees.add(employee);
        employeeClient.persist(employee);
    }

    public void mergeEmployee(EmployeeBean employee) {
        employeeClient.merge(employee);
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
        employeeClient.remove(employeeId);
    }

    public EmployeeBean findEmployee(int employeeId) {
        return employeeClient.find(employeeId);
    }

    // END: Methods


    // START: Getters and setters
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
    // END: Getters and setters

} // end of class
