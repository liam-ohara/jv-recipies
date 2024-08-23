package ref;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany
    @JoinColumn(name="recipe_id")
    List<Recipe> recipes;

    @OneToMany
    @JoinColumn(name="comment_id")
    List<Comment> comments;

    @OneToMany
    @JoinColumn(name="rating_id")
    List<Rating> ratings;

    AppUser(String username, String email, String roles, String registeredDate) {
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.registeredDate = registeredDate;
    }
}
