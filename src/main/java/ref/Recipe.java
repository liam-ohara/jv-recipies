package ref;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Recipe {

    @Id
    int id;

    @Column(nullable = false)
    String title;

    String description;

    @Column(nullable = false)
    String instructions;

    int preperationTimeInMinutes;

    @Column(nullable = false)
    int cookingTimeInMinutes;

    @Column(nullable = false)
    int servings;

    String difficultyLevel;

    int rating;

    @Column(nullable = false)
    @OneToMany
    List<Ingredient> ingredients;

    @Column(nullable = false)
    @OneToMany
    List<Category> categories;

//    @Column(nullable = false)
    @OneToOne
    AppUser appUser;

    @Column(nullable = false)
    String createdDate;

    String lastModifiedDate;

    public Recipe(String title, String instructions, int cookingTimeInMinutes, int servings, List<Ingredient> ingredients, List<Category> categories, AppUser appUser, String createdDate) {
        this.title = title;
        this.instructions = instructions;
        this.cookingTimeInMinutes = cookingTimeInMinutes;
        this.servings = servings;
        this.ingredients = ingredients;
        this.categories = categories;
        this.appUser = appUser;
        this.createdDate = createdDate;
    }
}
