package ref;

import common.Units;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
public class Ingredient {

    @Id
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    int quantity;

    @Column(nullable = false)
    String unit;

    @OneToMany
    @JoinColumn(name="recipe_id")
    List<Recipe> recipies;

    Ingredient(){}

    public Ingredient(String name, int quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
}
