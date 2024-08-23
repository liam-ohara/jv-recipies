import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = Database.getSessionFactory()) {

            sessionFactory.getSchemaManager().exportMappedObjects(true);
            sessionFactory.close();
        }
    }
}
