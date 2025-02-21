package ca.bcit.timemasters.client;

import ca.bcit.timemasters.model.WorkPackageBean;

import jakarta.enterprise.context.Dependent;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;

import java.io.Serializable;

@Dependent
public class WorkPackageClient implements Serializable {
    ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();

    String baseURI = ex.getRequestScheme() + "://"
            + ex.getRequestServerName() + ":"
            + ex.getRequestServerPort()
            + ex.getRequestContextPath()
            + "/api";
    
    public WorkPackageBean find(int workpackageId) {
        Client client = ClientBuilder.newClient();
        Response response = client.target(baseURI + "/workpackage/find/" + workpackageId)
                .request()
                .get();
        WorkPackageBean workpackage = response.readEntity(WorkPackageBean.class);
        client.close();
        return workpackage;
    }
    public void persist(WorkPackageBean workpackage) {
        // persist workpackage
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/workpackage/persist")
                .request()
                .post(Entity.json(workpackage));
        client.close();
    }
    public void merge(WorkPackageBean workpackage) {
        // merge workpackage
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/workpackage/merge")
                .request()
                .put(Entity.json(workpackage));
        client.close();
    }
    public void remove(int workpackageId) {
        // remove workpackage
        Client client = ClientBuilder.newClient();
        client.target(baseURI + "/workpackage/remove/" + workpackageId)
                .request()
                .delete();
        client.close();
    }
    
    public WorkPackageBean[] getAllByProject(int projectId) {
        Client client = ClientBuilder.newClient();
        Response response = client.target(baseURI + "/workpackage/all-by-project/" + projectId)
                .request()
                .get();
        WorkPackageBean[] workpackages = response.readEntity(WorkPackageBean[].class);
        client.close();
        return workpackages;
    }

    public WorkPackageBean[] getAllByEmployee(int employeeId) {
        Client client = ClientBuilder.newClient();
        Response response = client.target(baseURI + "/workpackage/all-by-employee/" + employeeId)
                .request()
                .get();
        WorkPackageBean[] workpackages = response.readEntity(WorkPackageBean[].class);
        client.close();
        return workpackages;
    }
} // end of class
