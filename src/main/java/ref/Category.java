package ref;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    int id;

    @Column(nullable = false)
    String name;

    @OneToMany
    @JoinColumn(name="recipe_id")
    List<Recipe> recipies;

    Category(String name) {
        this.name = name;
    }
}
