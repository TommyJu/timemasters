package ca.bcit.timemasters.model;

public class WorkPackageBean {
    private int workPackageId;
    private String status;
    private EmployeeBean responsibleEngineer;
    private double totalHours;
    private double weeklyHours;
    private boolean isLeaf;
    private WorkPackageBean parentPackage;
    private double budgetedEffort;
    private double plannedEffort;
    private double actualEffort;

    public WorkPackageBean(
            int workPackageId,
            String status,
            EmployeeBean responsibleEngineer,
            double totalHours,
            double weeklyHours,
            boolean isLeaf,
            WorkPackageBean parentPackage,
            double budgetedEffort,
            double plannedEffort,
            double actualEffort) 
    {
        this.workPackageId = workPackageId;
        this.status = status;
        this.responsibleEngineer = responsibleEngineer;
        this.totalHours = totalHours;
        this.weeklyHours = weeklyHours;
        this.isLeaf = isLeaf;
        this.parentPackage = parentPackage;
        this.budgetedEffort = budgetedEffort;
        this.plannedEffort = plannedEffort;
        this.actualEffort = actualEffort;
    }

    public int getWorkPackageId() {
        return workPackageId;
    }

    public void setWorkPackageId(int workPackageId) {
        this.workPackageId = workPackageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeBean getResponsibleEngineer() {
        return responsibleEngineer;
    }

    public void setResponsibleEngineer(EmployeeBean responsibleEngineer) {
        this.responsibleEngineer = responsibleEngineer;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public WorkPackageBean getParentPackage() {
        return parentPackage;
    }

    public void setParentPackage(WorkPackageBean parentPackage) {
        this.parentPackage = parentPackage;
    }

    public double getBudgetedEffort() {
        return budgetedEffort;
    }

    public void setBudgetedEffort(double budgetedEffort) {
        this.budgetedEffort = budgetedEffort;
    }

    public double getPlannedEffort() {
        return plannedEffort;
    }

    public void setPlannedEffort(double plannedEffort) {
        this.plannedEffort = plannedEffort;
    }

    public double getActualEffort() {
        return actualEffort;
    }

    public void setActualEffort(double actualEffort) {
        this.actualEffort = actualEffort;
    }

    
}
