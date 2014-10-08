package phone.book.dao;

import phone.book.model.Person;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by alexey on 07.10.14.
 */
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Person person) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(person);
        tx.commit();
        session.close();
    }

    @Override
    public List<Person> getPersonList() {
        Session session = this.sessionFactory.openSession();
        String hql = "from Person";
        List<Person> personList = session.createQuery(hql).list();
        session.close();
        return personList;
    }
}
