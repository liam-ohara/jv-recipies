package ref;

import jakarta.persistence.*;

@Entity
public class Rating {

    @Id
    int id;

    @Column(nullable = false)
    int ratingValue;

    @Column(nullable = false)
    String dateRated;

    @OneToOne
    Recipe recipe;

    @OneToOne
    AppUser rater;

    Rating(){}

    public Rating(int ratingValue, String dateRated, Recipe recipe, AppUser rater) {
        this.ratingValue = ratingValue;
        this.dateRated = dateRated;
        this.recipe = recipe;
        this.rater = rater;
    }
}
