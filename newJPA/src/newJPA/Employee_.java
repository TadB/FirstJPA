package newJPA;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-20T11:48:27.566+0200")
@StaticMetamodel(Employee.class)
public class Employee_ {
	public static volatile SingularAttribute<Employee, BigDecimal> commissionPct;
	public static volatile SingularAttribute<Employee, BigDecimal> departmentId;
	public static volatile SingularAttribute<Employee, String> email;
	public static volatile SingularAttribute<Employee, BigDecimal> employeeId;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SingularAttribute<Employee, Date> hireDate;
	public static volatile SingularAttribute<Employee, String> jobId;
	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, BigDecimal> managerId;
	public static volatile SingularAttribute<Employee, String> phoneNumber;
	public static volatile SingularAttribute<Employee, BigDecimal> salary;
}
