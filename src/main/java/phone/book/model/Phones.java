package phone.book.model;

import javax.persistence.*;

/**
 * Created by alexey on 08.10.14.
 */
@Entity
@Table(name = "PHONES")
public class Phones {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    public Phones() {
        super();
    }

    public Phones(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
