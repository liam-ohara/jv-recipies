package ref;

import common.Units;
import jakarta.persistence.*;

@Entity
public class Ingredient {

    @Id
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    int quantity;

    @Column(nullable = false)
    short unit;

    Ingredient(String name, int quantity, short unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
}
