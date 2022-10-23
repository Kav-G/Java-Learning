public class Employee{
	int empID;
	String empName;
	String designation;
	int age;
	String contact_number;
	String salary;
	
	static void showDetails(Employee employee){
		System.out.println(employee.empID);
		System.out.println(employee.empName);
		System.out.println(employee.designation);
		System.out.println(employee.age);
		System.out.println(employee.contact_number);
		System.out.println(employee.salary);
		System.out.println("");
	}

	public static void main(String args[]){
		Employee EmployeeA = new Employee();
		Employee EmployeeB = new Employee();
		
		EmployeeA.empID=1101;
		EmployeeA.empName="S.D.Pabasara";
		EmployeeA.designation="HR Specialist";
		EmployeeA.age=30;
		EmployeeA.contact_number="0774934323";
		EmployeeA.salary="Rs.60000";
		
		EmployeeB.empID=1200;
		EmployeeB.empName="A.L.Hashini";
		EmployeeB.designation="HR Assistant";
		EmployeeB.age=28;
		EmployeeB.contact_number="0715687643";
		EmployeeB.salary="Rs.40000";
		
		showDetails(EmployeeA);
		showDetails(EmployeeB);
	}
}