package ca.bcit.timemasters.model;

/**
 * Represents an Employee with associated credentials, role, and labour grade.
 */
public class EmployeeBean {
    private int employeeId;
    private String name;
    private CredentialBean credentials;
    private RoleBean role;
    private LabourGradeBean labourGrade;

    /**
     * Constructs an EmployeeBean with the given details.
     *
     * @param employeeId  the unique identifier of the employee
     * @param name        the name of the employee
     * @param credentials the credentials of the employee
     * @param role        the role assigned to the employee
     * @param labourGrade the labour grade of the employee
     */
    public EmployeeBean(int employeeId, String name, CredentialBean credentials, RoleBean role, LabourGradeBean labourGrade) {
        this.employeeId = employeeId;
        this.name = name;
        this.credentials = credentials;
        this.role = role;
        this.labourGrade = labourGrade;
    }

    /**
     * Gets the employee ID.
     *
     * @return the employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     *
     * @param employeeId the new employee ID
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the employee's name.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the credentials of the employee.
     *
     * @return the credentials of the employee
     */
    public CredentialBean getCredentials() {
        return credentials;
    }

    /**
     * Sets the credentials of the employee.
     *
     * @param credentials the new credentials of the employee
     */
    public void setCredentials(CredentialBean credentials) {
        this.credentials = credentials;
    }

    /**
     * Gets the role of the employee.
     *
     * @return the role of the employee
     */
    public RoleBean getRole() {
        return role;
    }

    /**
     * Sets the role of the employee.
     *
     * @param role the new role of the employee
     */
    public void setRole(RoleBean role) {
        this.role = role;
    }

    /**
     * Gets the labour grade of the employee.
     *
     * @return the labour grade of the employee
     */
    public LabourGradeBean getLabourGrade() {
        return labourGrade;
    }

    /**
     * Sets the labour grade of the employee.
     *
     * @param labourGrade the new labour grade of the employee
     */
    public void setLabourGrade(LabourGradeBean labourGrade) {
        this.labourGrade = labourGrade;
    }
}