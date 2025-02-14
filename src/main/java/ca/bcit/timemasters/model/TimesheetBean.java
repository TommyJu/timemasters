package ca.bcit.timemasters.model;

import java.util.List;

public class TimesheetBean {
    private List<TimesheetRowBean> timesheetRowBeans;
    private EmployeeBean employee;
    private int weekNumber;
    private double overtimeHours;
    private double flextimeHours;

    public List<TimesheetRowBean> getTimesheetRowBeans() {
        return timesheetRowBeans;
    }

    public void setTimesheetRowBeans(List<TimesheetRowBean> timesheetRowBeans) {
        this.timesheetRowBeans = timesheetRowBeans;
    }

    public EmployeeBean getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeBean employee) {
        this.employee = employee;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getFlextimeHours() {
        return flextimeHours;
    }

    public void setFlextimeHours(double flextimeHours) {
        this.flextimeHours = flextimeHours;
    }
}
