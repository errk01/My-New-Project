import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    private int did;
    private String dname;

//    @OneToMany(targetEntity = Teacher.class)
//    private List<Teacher> teacherList;

    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }

    public Department() {

    }


    public Department(int did, String dname, List<Teacher> teacherList) {
        super();
        this.did = did;
        this.dname = dname;
//        this.teacherList = teacherList;
    }
}
