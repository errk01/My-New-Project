import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="staffdb")
public class Teacher {
    // pirmary key
    @Id
    private int eid;
    // fields
    private String name;
    private double salary;


//    @ManyToOne
//    private Department department;

    public Teacher(int eid, String name, double salary, Department department) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
//        this.department = department;
    }

    public Teacher(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public Teacher() {}
}
