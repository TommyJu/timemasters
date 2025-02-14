package ca.bcit.timemasters.model;

public class TimesheetRowBean {
    private int packageId;
    private int projectId;
    private String notes;
    private long packedHours;

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getPackedHours() {
        return packedHours;
    }

    public void setPackedHours(long packedHours) {
        this.packedHours = packedHours;
    }
}
