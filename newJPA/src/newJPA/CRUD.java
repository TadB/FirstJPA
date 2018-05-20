package newJPA;

import java.math.BigDecimal;
import java.util.Date;

public class CRUD {

	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();
//-----------DANE TESTOWE --------------		
		Employee employee = new Employee();
		Employee data = new Employee();
		int id = 200;
		employee.setFirstName("Adam");
		employee.setLastName("Nowak");
		employee.setEmployeeId(new BigDecimal("333"));
		Date hireDate = new Date();
		employee.setHireDate(hireDate);
		employee.setManagerId(new BigDecimal("100"));
		employee.setDepartmentId(new BigDecimal("50"));
		employee.setSalary(new BigDecimal("6040"));
//-------------------------------------------
		
		employeeCRUD.createEmployee(employee);
		data = employeeCRUD.readEmployee(id);
		employeeCRUD.updateSalary(id);
		employeeCRUD.deleteEmployee(id);
	}

}
