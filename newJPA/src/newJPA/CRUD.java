package newJPA;

public class CRUD {

	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();

		Employee employee = new Employee();
		Employee data = new Employee();
		int id = 200;
		
		employeeCRUD.createEmployee(employee);
		data = employeeCRUD.readEmployee(id);
		employeeCRUD.updateSalary(id);
		employeeCRUD.deleteEmployee(id);
	}

}
