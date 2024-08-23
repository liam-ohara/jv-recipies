import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ref.*;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {

    public static SessionFactory getSessionFactory(){
        var sessionFactory = new Configuration()
                // use H2 in-memory database
                .setProperty(URL, "jdbc:h2:mem:db1")
                .setProperty("hibernate.agroal.maxSize", "20")
                // default username / password
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
                .buildSessionFactory();

        return sessionFactory;
    }

}
