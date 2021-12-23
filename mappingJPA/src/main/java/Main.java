import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("staffdb");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

//        Department dept1 = new Department(1,"first department");
//        manager.persist(dept1);


        Teacher teacherOne = new Teacher(1,"Joe",60000);
        manager.persist(teacherOne);
        Teacher teacherTwo = new Teacher(2,"Tom",65000);
        manager.persist(teacherTwo);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacherOne);
        teacherList.add(teacherTwo);

        Department dept1 = new Department(1,"first department", teacherList);
        manager.persist(dept1);

        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}
