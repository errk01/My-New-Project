package service;

import entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdatingEmployee {
    public void updateEmployee(int eid, double newSalary) {

FindingEmployee findEmp = new FindingEmployee();

            EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPATESTWO" );
            EntityManager entitymanager = emfactory.createEntityManager();
            entitymanager.getTransaction( ).begin( );
            EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,eid);
            employee.setSalary(newSalary);
//            EmployeeEntity emp = findEmp.findEmployee(eid);
//            emp.setSalary(newSalary);
            entitymanager.getTransaction().commit();
            System.out.println("employee EMAIL = " + employee.getEmail());
            entitymanager.close();
            emfactory.close( );






//            System.out.println("Before Updation");
//            System.out.println("employee ID = " + employee.getEmployeeNumber());
//            System.out.println("employee FIRST NAME = " + employee.getFirstName());
//            System.out.println("employee LAST NAME = " + employee.getLastName());
//            System.out.println("employee EMAIL = " + employee.getEmail());
//            System.out.println("employee OfficeCode = " + employee.getOfficecode());
//            System.out.println("After Updation");
//            employee.setEmail("xyz01@prscholas.org");


    }

    }

