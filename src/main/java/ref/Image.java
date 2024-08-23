package ref;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    int id;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    String fileData;

    @OneToOne
    Recipe recipe;

    Image(){}

    public Image(String filename, String fileData, Recipe recipe) {
        this.filename = filename;
        this.fileData = fileData;
        this.recipe = recipe;
    }
}
