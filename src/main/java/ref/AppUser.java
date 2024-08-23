package ref;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppUser {

    @Id
    int id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String roles;

    @Column(nullable = false)
    String registeredDate;

    AppUser(String username, String email, String roles, String registeredDate) {
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.registeredDate = registeredDate;
    }
}
