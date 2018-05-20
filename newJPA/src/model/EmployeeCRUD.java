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
        Employee emp = entityManager.find(Employee.class, new BigDecimal("300"));
        entityManager.remove(emp);
        entityManager.getTransaction().commit();
        entityManager.close();
//        entityManager.merge(employee);

    }
    public void updateSalary(int id) {
    }
    public Employee readEmployee(int id) {
    	Employee emp = new Employee();
    	return emp;
    }
    
    
    @Override
    public void finalize(){
        entityManagerFactory.close();
    }
}
