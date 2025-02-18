package ca.bcit.timemasters.model;

public interface RoleBean {
    /**
     * Gets the role ID.
     *
     * @return the role ID
     */
    int getRoleId();

    /**
     * Sets the role ID.
     *
     * @param roleId the new role ID
     */
    void setRoleId(int roleId);

    /**
     * Gets the role name.
     *
     * @return the name of the role
     */
    String getRoleName();

    /**
     * Sets the role name.
     *
     * @param roleName the new role name
     */
    void setRoleName(String roleName);  
}
