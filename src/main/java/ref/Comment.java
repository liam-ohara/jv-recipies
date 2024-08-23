package ref;

import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    int id;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    String datePosted;

    @OneToOne
    AppUser user;

    @OneToOne
    Recipe recipe;

    public Comment(String text, String datePosted, AppUser user, Recipe recipe) {
        this.text = text;
        this.datePosted = datePosted;
        this.user = user;
        this.recipe = recipe;
    }
}


