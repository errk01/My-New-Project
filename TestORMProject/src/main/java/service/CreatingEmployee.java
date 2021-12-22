package service;

import entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreatingEmployee {


    public void createEmployee(EmployeeEntity employee){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("JPATESTWO");
        EntityManager em = emfactory.createEntityManager();
        // Start of the transaction
        em.getTransaction().begin();
        // preforms action on the DB
        em.persist(employee);
        // Commit the transaction
        em.getTransaction().commit();

        // closing everything out
        em.close();
        emfactory.close( );

//        EmployeeEntity employee = new EmployeeEntity();

//        employee.setEmail( "mk@gmai.com");
//        employee.setFirstName( "Alex" );
//        employee.setLastName("Mick");
//        employee.setEmployeeName(23);
//        employee.setOfficecode(1);
    }
}

