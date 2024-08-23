package ref;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    int id;

    @Column(nullable = false)
    String name;

    Category(String name) {
        this.name = name;
    }
}
