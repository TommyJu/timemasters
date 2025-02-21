package ca.bcit.timemasters.model;
import jakarta.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="employee")
public class EmployeeBean extends PanacheEntityBase {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "supervisor_id")
    private Long supervisor;

    @Column(name = "timesheet_approver_id")
    private Long timesheetApprover;

    @ManyToOne
    @JoinColumn(name = "labour_grade_id", referencedColumnName = "labour_grade_id")
    private LabourGradeBean labourGrade;

    @OneToOne
    @JoinColumn(name = "credential_id", referencedColumnName = "credential_id")
    private CredentialBean credentials;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Column(name = "is_business_manager")
    private Boolean isBusinessManager;

    @Column(name = "is_hr")
    private Boolean isHr;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "vacation_balance")
    private Double vacationBalance;

    @Column(name = "flex_hour_balance")
    private Double flexHourBalance;

    @Column(name = "sick_leave_balance")
    private Double sickLeaveBalance;

    //No Argument Constructor
    public EmployeeBean() {

    }
    
    //Getters and Setters
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Long supervisor) {
        this.supervisor = supervisor;
    }

    public Long getTimesheetApprover() {
        return timesheetApprover;
    }

    public void setTimesheetApprover(Long timesheetApprover) {
        this.timesheetApprover = timesheetApprover;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsBusinessManager() {
        return isBusinessManager;
    }

    public void setIsBusinessManager(Boolean isBusinessManager) {
        this.isBusinessManager = isBusinessManager;
    }

    public Boolean getIsHr() {
        return isHr;
    }

    public void setIsHr(Boolean isHr) {
        this.isHr = isHr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getVacationBalance() {
        return vacationBalance;
    }

    public void setVacationBalance(Double vacationBalance) {
        this.vacationBalance = vacationBalance;
    }

    public Double getFlexHourBalance() {
        return flexHourBalance;
    }

    public void setFlexHourBalance(Double flexHourBalance) {
        this.flexHourBalance = flexHourBalance;
    }

    public Double getSickLeaveBalance() {
        return sickLeaveBalance;
    }

    public void setSickLeaveBalance(Double sickLeaveBalance) {
        this.sickLeaveBalance = sickLeaveBalance;
    }
}
