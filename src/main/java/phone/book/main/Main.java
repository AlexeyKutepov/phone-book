package phone.book.main;

import phone.book.dao.PersonDao;
import phone.book.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import phone.book.model.Phones;

import java.util.List;

/**
 * Created by alexey on 07.10.14.
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDao personDAO = context.getBean(PersonDao.class);

        Person person = new Person("alexey", new Phones("89200868942"));

        personDAO.save(person);

        System.out.println("Person::"+person);

        List<Person> list = personDAO.getPersonList();

        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
    }
}
