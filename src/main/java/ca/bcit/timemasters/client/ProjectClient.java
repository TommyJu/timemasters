package ca.bcit.timemasters.client;

import ca.bcit.timemasters.model.ProjectBean;
import jakarta.enterprise.context.Dependent;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;

@Dependent
public class ProjectClient {
    ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();

    String baseURI = ex.getRequestScheme() + "://"
            + ex.getRequestServerName() + ":"
            + ex.getRequestServerPort()
            + ex.getRequestContextPath()
            + "/api";

    /**
     * Find project record from database
     * @param id primary key for record
     * @return the ProjectBean record with key = id, null if not found
     */
    public ProjectBean find(int id) {
        Client client = ClientBuilder.newClient();
        ProjectBean project = client.target(baseURI)
                .path("projects").path("" + id)
                .request().get(ProjectBean.class);
        client.close();
        return project;
    }

    /**
     * Persist project record into database. id must be unique.
     *
     * @param project the record to be persisted.
     */
    public void persist(ProjectBean project) {
        Client client = ClientBuilder.newClient();
        client.target(baseURI)
                .path("projects")
                .request().post(Entity.xml(project));
        client.close();
    }

    /**
     * Merge project record fields into existing database record.
     *
     * @param project the record to be merged
     */
    public void merge(ProjectBean project) {
        Client client = ClientBuilder.newClient();
        client.target(baseURI)
                .path("projects")
                .request().put(Entity.xml(project));
        client.close();
    }

    /**
     * Remove project from database
     *
     * @param id id of record to be removed from database
     */
    public void remove(int id) {
        Client client = ClientBuilder.newClient();
        client.target(baseURI)
                .path("projects").path("" + id)
                .request().delete();
        client.close();
    }

    /**
     * Return Projects table as array of ProjectBean.
     *
     * @return ProjectBean[] of all records in Project table
     */
    public ProjectBean[] getAll() {
        Client client = ClientBuilder.newClient();
        Response res = client.target(baseURI)
                .path("projects")
                .request().get();
        ProjectBean[] array = res.readEntity(ProjectBean[].class);
        client.close();
        return array;
    }

}
