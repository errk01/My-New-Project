import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="Credentials")
public class Credentials implements Serializable {

    @Id
    @OneToOne
    private Teacher eid;

    private String username;
    private String password;
    public Credentials(Teacher eid, String username, String password) {
        this.eid = eid;
        this.username = username;
        this.password = password;
    }
    public Credentials() {}
}
