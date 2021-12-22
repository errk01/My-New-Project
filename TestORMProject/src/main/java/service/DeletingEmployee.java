package service;

import entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeletingEmployee {

    public void deleteEmployee(int eid) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPATESTWO");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        EmployeeEntity employee = entitymanager.find(EmployeeEntity.class, eid);
        entitymanager.remove(employee);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}