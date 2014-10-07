package phone.book.model;

import javax.persistence.*;

/**
 * Created by alexey on 07.10.14.
 */
@Entity
@Table
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phone;

    public Person() {
        super();
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
