package ca.bcit.timemasters.model;

import java.util.Date;

public class ProjectBean {
    private int projectNumber;
    private String projectName;
    private EmployeeBean projectManager;
    private double employeeMarkup;
    private double clientMarkup;
    private Date startDate;
    private Date endDate;
    private String status;

    public ProjectBean(){}

    public ProjectBean(int projectNumber, String projectName, EmployeeBean projectManager, double employeeMarkup, double clientMarkup, Date startDate, Date endDate, String status){
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.employeeMarkup = employeeMarkup;
        this.clientMarkup = clientMarkup;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getProjectNumber(){
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber){
        this.projectNumber = projectNumber;
    }

    public String getProjectName(){
        return projectName;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public EmployeeBean getProjectManager(){
        return projectManager;
    }

    public void setProjectManager(EmployeeBean projectManager){
        this.projectManager = projectManager;
    }

    public double getEmployeeMarkup(){
        return employeeMarkup;
    }

    public void setEmployeeMarkup(double employeeMarkup){
        this.employeeMarkup = employeeMarkup;
    }

    public double getClientMarkup(){
        return clientMarkup;
    }

    public void setClientMarkup(double clientMarkup){
        this.clientMarkup = clientMarkup;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
