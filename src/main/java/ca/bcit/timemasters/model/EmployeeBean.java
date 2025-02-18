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

    @ManyToOne
    @JoinColumn(name = "supervisor_id", referencedColumnName = "employee_id")
    private EmployeeBean supervisor;

    @ManyToOne
    @JoinColumn(name = "timesheet_approver_id", referencedColumnName = "employee_id")
    private EmployeeBean timesheetApprover;

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
    
}
