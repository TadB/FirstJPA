package model;

import java.math.BigDecimal;
import java.util.Date;

public class CRUD {

	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();
//-----------DANE TESTOWE --------------		
		Employee employee = new Employee();
		Employee emp = new Employee();
		BigDecimal id = new BigDecimal("333");
		employee.setFirstName("Adam");
		employee.setLastName("Nowak");
		employee.setEmployeeId(new BigDecimal("333"));
		Date hireDate = new Date();
		employee.setHireDate(hireDate);
		employee.setManagerId(new BigDecimal("100"));
		employee.setDepartmentId(new BigDecimal("50"));
		employee.setSalary(new BigDecimal("6040"));
		employee.setEmail("ANOWAK");
		employee.setJobId("AD_VP");
//-------------------------------------------
		
		employeeCRUD.createEmployee(employee);
		emp = employeeCRUD.readEmployee(id);
		System.out.println("testowanie metody szukania pracownika: ");
		System.out.println(emp.getFirstName() + " " + emp.getLastName());
		employeeCRUD.updateSalary(id);
		employeeCRUD.deleteEmployee(id);
	}

}
