package service;

import entity.EmployeeEntity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

//@NamedQuery(query = "SELECT e FROM EmployeeEntity e WHERE e.id = :id", name="Find employee by id")
public class FindingEmployee extends EmployeeEntity {

    public static void main( String[ ] args ) {

//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "classicmodels" );
//        EntityManager entitymanager = emfactory.createEntityManager();
//        EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1056);

        EmployeeEntity employee = findEmployee(1002);
        System.out.println("employee ID = " + employee.getEmployeeNumber());
        System.out.println("employee FIRST NAME = " + employee.getFirstName());
        System.out.println("employee LAST NAME = " + employee.getLastName());
        System.out.println("employee EMAIL = " + employee.getEmail());
        System.out.println("employee OfficeCode = " + employee.getOfficeCode());
    }


    public static EmployeeEntity findEmployee(int empId){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("classicmodels");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EmployeeEntity foundEmployee = entityManager.find(EmployeeEntity.class, empId);
//        return foundEmployee;
        Query q = entityManager.createNamedQuery("Find employee by id");
        q.setParameter("id", empId);
        List<EmployeeEntity> employees = q.getResultList();
        return (EmployeeEntity) employees;
    }
}
