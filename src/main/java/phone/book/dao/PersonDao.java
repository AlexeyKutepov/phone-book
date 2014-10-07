package phone.book.dao;

import phone.book.model.Person;

import java.util.List;

/**
 * Created by alexey on 07.10.14.
 */
public interface PersonDao {
    public void save(Person p);

    public List<Person> getPersonList();
}
