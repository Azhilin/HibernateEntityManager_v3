package HEM;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by azhilin on 26.01.2017.
 */
public class MainHEM {
    public static void main(String[] args) {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();

        MyUser user = new MyUser();
        user.setName("Alex");
        user.setSurname("Zhilin");

        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
