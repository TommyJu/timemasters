package ca.bcit.timemasters.model;
import jakarta.persistence.*;

@Entity
@Table(name="labour_grade")
public class LabourGradeBean{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="labour_grade_id")
    private Long labourGradeId;

    @Enumerated(EnumType.STRING)
    @Column(name="labour_grade", nullable = false, unique = true)
    private LabourGrade labourGrade;

    @Column(name="charge_rate", nullable = false)
    private Float chargeRate;

    @Column(name="fiscal_year", nullable = false)
    private Integer fiscalYear;

    //No Argument Constructor
    public LabourGradeBean() {

    }

    //Getters and Setters
    public Long getLabourGradeId() {
        return labourGradeId;
    }

    public void setLabourGradeId(Long labourGradeId) {
        this.labourGradeId = labourGradeId;
    }

    public LabourGrade getLabourGrade() {
        return labourGrade;
    }

    public void setLabourGrade(LabourGrade labourGrade) {
        this.labourGrade = labourGrade;
    }

    public Float getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(Float chargeRate) {
        this.chargeRate = chargeRate;
    }

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
}
