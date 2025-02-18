package ca.bcit.timemasters.model;

public class LabourGradeBean {
    private int labourGradeId;
    private float chargeRate;

    public LabourGradeBean(int labourGradeId, float chargeRate) {
        this.labourGradeId = labourGradeId;
        this.chargeRate = chargeRate;
    }

    public int getLabourGradeId() {
        return labourGradeId;
    }
    
    public void setLabourGradeId(int labourGradeId) {
        this.labourGradeId = labourGradeId;
    }
    
    public float getChargeRate() {
        return chargeRate;
    }
    
    public void setChargeRate(float chargeRate) {
        this.chargeRate = chargeRate;
    }
}
