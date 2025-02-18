package ca.bcit.timemasters.client;
import java.io.Serializable;

import ca.bcit.timemasters.model.EmployeeBean;

import jakarta.enterprise.context.Dependent;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;

@Dependent
public class EmployeeClient implements Serializable{

    ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();

    String baseURI = ex.getRequestScheme() + "://"
            + ex.getRequestServerName() + ":"
            + ex.getRequestServerPort()
            + ex.getRequestContextPath()
            + "/api";

    public EmployeeBean find(int employeeId) {
        Client client = ClientBuilder.newClient();
        Response response = client.target(baseURI + "/employee/find/" + employeeId)
                .request()
                .get();
        EmployeeBean employee = response.readEntity(EmployeeBean.class);
        client.close();
        return employee;
    }
    public void persist(EmployeeBean employee) {
        // persist employee
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/employee/insert")
                .request()
                .post(Entity.json(employee));
        client.close();
    }
    public void merge(EmployeeBean employee) {
        // merge employee
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/employee/update")
                .request()
                .put(Entity.json(employee));
        client.close();
    }
    public void remove(EmployeeBean employee) {
        // remove employee
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/employee/delete/" + employee.getEmployeeId())
                .request()
                .delete();
        client.close();
    }
    public EmployeeBean[] getAll() {
        Client client = ClientBuilder.newClient();
        Response response = client.target(baseURI + "/employee/all")
                .request()
                .get();
        EmployeeBean[] employees = response.readEntity(EmployeeBean[].class);
        client.close();
        return employees;
    }

}// end of class
