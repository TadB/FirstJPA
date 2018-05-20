package model;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeCRUD {
    private EntityManagerFactory entityManagerFactory;

    EmployeeCRUD(){
        entityManagerFactory = Persistence.createEntityManagerFactory("newJPA");
    }
    public void createEmployee(Employee employee){
        EntityManager entityManager;
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void deleteEmployee(BigDecimal id){
    	EntityManager entityManager;
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Employee emp = entityManager.find(Employee.class, id);
        entityManager.remove(emp);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void updateSalary(int id) {
    }
    public Employee readEmployee(BigDecimal id) {
      	EntityManager entityManager;
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Employee emp = entityManager.find(Employee.class, id);
        entityManager.close();
    	return emp;
    }
    
    
    @Override
    public void finalize(){
        entityManagerFactory.close();
    }
}
