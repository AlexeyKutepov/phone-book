package phone.book.model;

import javax.persistence.*;

/**
 * Created by alexey on 07.10.14.
 */
@Entity
@Table(name="PERSON")
public class Person {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private Phones phones;

    public Person() {
        super();
    }

    public Person(String name, Phones phone) {
        this.name = name;
        this.phones = phone;
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

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phone) {
        this.phones = phone;
    }
}
