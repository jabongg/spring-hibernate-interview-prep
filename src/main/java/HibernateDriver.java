import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateDriver {
    public static void main(String[] args) {
        final Configuration configuration = new Configuration().configure();
        final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        final SessionFactory factory = configuration.buildSessionFactory(builder.build());
        final Session session = factory.openSession();

        createEntity(session);
       // session.delete(employee3);

       // deleteEntity(session);

        //updateEntityById(session);
        session.close();
        factory.close();
    }


    private static void createEntity(Session session) {

        session.beginTransaction();

        Employee employee1 = new Employee(1, "Michael", "Jang");
        Employee employee2 = new Employee(2, "Sarah", "Jang");
        Employee employee3 = new Employee(3, "Tinah", "Jang");

        // Integer employeeId = (Integer) session.save(employee);
        //System.out.println(employeeId);

       // session.save(employee1);
       // session.save(employee2);
       // Integer emp3 = (Integer) session.save(employee3);

       // session.getTransaction().commit();


        updateEntityById(session);

    }

    private static void saveEntity(Session session) {
    }


    private static void updateEntityById(Session session) {
        Employee employee = (Employee) session.get(Employee.class, 2);
        if (employee != null) {
            employee.setFirstName("Zara");
            employee.setLastName("Ling");

            session.beginTransaction();
            session.update(employee);
            session.getTransaction().commit();
        } else {
            System.out.println("Employee doesn't exist with id = " + 2);
        }
    }


    private static void deleteEntity(Session session) {
        Employee employee = (Employee) session.get(Employee.class, 2);
        if (employee != null) {
            employee.setFirstName("Sara");
            employee.setLastName("Ling");

            session.beginTransaction();
            session.delete(employee);
            session.getTransaction().commit();
        } else {
            System.out.println("Employee doesn't exist with id = " + 2);
        }
    }

    private static void understandingProxyObjectConcept(Session session) {

    }

}
