import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ref.*;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {

    public static SessionFactory getSessionFactory(){
        var sessionFactory = new Configuration()
                // use H2 in-memory database
                .setProperty("hibernate.agroal.maxSize", "20")
                // default username / password
                .setProperty(URL, "jdbc:h2:mem:db1")
                .setProperty(USER, "sa")
                .setProperty(PASS, "")
                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(AppUser.class)
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Rating.class)
                .buildSessionFactory();

        return sessionFactory;
    }

    static void seed(){
        var sessionFactory = getSessionFactory();
        sessionFactory.inTransaction(session -> {
        Ingredient ingredient = new Ingredient("Peas", 5, "grams" );
        session.persist(ingredient);

//                session.refresh(ingredient);

//            session.persist(new Recipe(/* your constructor params go here */));
//            session.persist(new AppUser());
//            session.persist(new Category());
//            session.persist(new Comment());
//            session.persist(new Image());
//            session.persist(new Rating());
//            session.persist(new Tag());
            session.flush();
            session.refresh(ingredient);
//            session.close();
        });


    }

}
