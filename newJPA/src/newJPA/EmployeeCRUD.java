package newJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeCRUD {
    private EntityManagerFactory entityManagerFactory;

    EmployeeCRUD(){
        entityManagerFactory = Persistence.createEntityManagerFactory("FirstJPA");
    }
    public void createEmployee(Employee employee){
        EntityManager entityManager;
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void deleteEmployee(int id){
    	EntityManager entityManager;
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
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
