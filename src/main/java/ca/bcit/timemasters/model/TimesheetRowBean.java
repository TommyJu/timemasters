package ca.bcit.timemasters.model;

public class TimesheetRowBean {
    private int packageId;
    private int projectId;
    private String notes;
    private long packedHours;

    /** mask for packing, unpacking hours. */
    private static final long[] MASK = {0xFFL,
            0xFF00L,
            0xFF0000L,
            0xFF000000L,
            0xFF00000000L,
            0xFF0000000000L,
            0xFF000000000000L};

    /** mask for packing, unpacking hours. */
    private static final long[] UMASK = {0xFFFFFFFFFFFFFF00L,
            0xFFFFFFFFFFFF00FFL,
            0xFFFFFFFFFF00FFFFL,
            0xFFFFFFFF00FFFFFFL,
            0xFFFFFF00FFFFFFFFL,
            0xFFFF00FFFFFFFFFFL,
            0xFF00FFFFFFFFFFFFL};



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

    /**
     * (0 == Monday, 6 == Sunday)
     * @param day
     * @param charge
     */
    public void setHours(int day, double charge) {
        packedHours = packedHours & UMASK[day] | (long) charge << (day * 8);
    }

    /**
     * (0 == Monday, 6 == Sunday)
     * @param day
     * @return
     */
    public double getHours(int day) {
        return (double) ((packedHours & MASK[day]) >> day * 8);
    }

    public double getMon() {
        return getHours(0);
    }

    public void setMon(double charge) {
        setHours(0, charge);
    }

    public double getTue() {
        return getHours(1);
    }

    public void setTue(double charge) {
        setHours(1, charge);
    }

    public double getWed() {
        return getHours(2);
    }

    public void setWed(double charge) {
        setHours(2, charge);
    }

    public double getThu() {
        return getHours(3);
    }

    public void setThu(double charge) {
        setHours(3, charge);
    }

    public double getFri() {
        return getHours(4);
    }

    public void setFri(double charge) {
        setHours(4, charge);
    }

    public double getSat() {
        return getHours(5);
    }

    public void setSat(double charge) {
        setHours(5, charge);
    }

    public double getSun() {
        return getHours(6);
    }

    public void setSun(double charge) {
        setHours(6, charge);
    }
}
