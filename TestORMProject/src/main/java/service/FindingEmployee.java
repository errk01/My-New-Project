package service;

import entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class FindingEmployee extends EmployeeEntity {

    public static void main( String[ ] args ) {

//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "classicmodels" );
//        EntityManager entitymanager = emfactory.createEntityManager();
//        EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1056);
//

        EmployeeEntity employee = findEmployee(1002);
        System.out.println("employee ID = " + employee.getFirstName());
        System.out.println("employee FIRST NAME = " + employee.getFirstName());
        System.out.println("employee LAST NAME = " + employee.getLastName());
        System.out.println("employee EMAIL = " + employee.getEmail());
        System.out.println("employee OfficeCode = " + employee.getOfficeCode());

    }


    public static EmployeeEntity findEmployee(int empId){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("classicmodels");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EmployeeEntity foundEmployee = entityManager.find(EmployeeEntity.class, empId);
        return foundEmployee;
    }

}
