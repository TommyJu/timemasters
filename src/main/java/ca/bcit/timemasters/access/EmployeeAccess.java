package ca.bcit.timemasters.access;

import ca.bcit.timemasters.model.EmployeeBean;
import ca.bcit.timemasters.model.CredentialBean;
import ca.bcit.timemasters.model.RoleBean;
import ca.bcit.timemasters.model.LabourGradeBean;

import jakarta.annotation.Resource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeAccess {
    @Resource(mappedName = "java:jboss/datasources/TimeMasters")

    //TODO implement all the model classes first

    // public EmployeeBean find(int employeeId) {
    //     String query = "SELECT * FROM Employees WHERE employee_id = ?";
    //     try (Connection connection = dataSource.getConnection();
    //          PreparedStatement statement = connection.prepareStatement(query)) {
    //         statement.setInt(1, employeeId);
    //         ResultSet resultSet = statement.executeQuery();
    //         if (resultSet.next()) {
    //             return new EmployeeBean(
    //                     resultSet.getInt("employee_id"),
    //                     resultSet.getString("name"),
    //                     new CredentialBean(
    //                             resultSet.getString("username"),
    //                             resultSet.getString("password")
    //                     ),
    //                     new RoleBean(
    //                             resultSet.getString("role_name")
    //                     ),
    //                     new LabourGradeBean(
    //                             resultSet.getString("grade_name")
    //                     )
    //             );
    //         }

    //     } catch () {

    //     }
    //     return null;
    // }

    public void remove(EmployeeBean employee) {
        // remove employee
    }
    public void insert(EmployeeBean employee) {
        // insert employee
    }
    public void merge(EmployeeBean employee) {
        // merge employee
    }
}
