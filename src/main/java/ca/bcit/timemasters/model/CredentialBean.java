package ca.bcit.timemasters.model;
import jakarta.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Table(name="credential")
public class CredentialBean extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="credential_id")
    private Long credentialId;

    @Column
    private String email;

    @Column
    public String password;

    //Default constructor
    public CredentialBean() {

    }

    public CredentialBean(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //Getters and Setters
    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
