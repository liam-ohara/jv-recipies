package ref;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tag {
    @Id
    int id;

    @Column(nullable = false)
    String name;

    Tag(){}

    Tag(String name) {
        this.name = name;
    }
}
