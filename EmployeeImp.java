package pkg_oops;

public class EmployeeImp {

	public static void main(String[] args) {
		
		System.out.println("Using Constructor");
		System.out.println("--------------------");
		Employee emp1=new Employee(101,"Neha","Developer",30000);
		System.out.println(emp1);
		
		Employee emp2=new Employee(102,"Geeta","Testing",30000);
		System.out.println(emp2);
		
		Employee emp3=new Employee(103,"Ramesh","Developer",25000);
		System.out.println(emp3);
		
		Employee emp4=new Employee(104,"Seeta","Testing",35000);
		System.out.println(emp4);
		
		Employee emp5=new Employee(105,"Ram","Testing",25000);
		System.out.println(emp5);
		
		
        System.out.println();
		System.out.println("Using Getter and Setter");
		System.out.println("--------------------");
		
		Employee emp6=new Employee();
		emp6.setId(106);
		emp6.setName("Jiya");
		emp6.setDepartment("Developer");
		emp6.setSalary(30000);
		
		System.out.println("Employee_ID: "+emp6.getId());
		System.out.println("Employee_Name:"+emp6.getName());
		System.out.println("Employee_Department: "+emp6.getDepartment());
		System.out.println("Employee_Salary: "+emp6.getSalary());
		System.out.println("----------------------");
		
		Employee emp7=new Employee();
		emp7.setId(107);
		emp7.setName("Riya");
		emp7.setDepartment("Developer");
		emp7.setSalary(25000);
		
		System.out.println("Employee_ID: "+emp7.getId());
		System.out.println("Employee_Name:"+emp7.getName());
		System.out.println("Employee_Department: "+emp7.getDepartment());
		System.out.println("Employee_Salary: "+emp7.getSalary());
		System.out.println("----------------------");
		
		
		Employee emp8=new Employee();
		emp8.setId(108);
		emp8.setName("Ruhi");
		emp8.setDepartment("Tester");
		emp8.setSalary(25000);
		
		System.out.println("Employee_ID: "+emp8.getId());
		System.out.println("Employee_Name:"+emp8.getName());
		System.out.println("Employee_Department: "+emp8.getDepartment());
		System.out.println("Employee_Salary: "+emp8.getSalary());
		System.out.println("----------------------");
		
		Employee emp9=new Employee();
		emp9.setId(109);
		emp9.setName("Ram");
		emp9.setDepartment("Developer");
		emp9.setSalary(35000);
		
		System.out.println("Employee_ID: "+emp9.getId());
		System.out.println("Employee_Name:"+emp9.getName());
		System.out.println("Employee_Department: "+emp9.getDepartment());
		System.out.println("Employee_Salary: "+emp9.getSalary());
		System.out.println("----------------------");
		
		Employee emp10=new Employee();
		emp10.setId(110);
		emp10.setName("Amit");
		emp10.setDepartment("Tester");
		emp10.setSalary(25000);
		
		System.out.println("Employee_ID: "+emp10.getId());
		System.out.println("Employee_Name:"+emp10.getName());
		System.out.println("Employee_Department: "+emp10.getDepartment());
		System.out.println("Employee_Salary: "+emp10.getSalary());
		System.out.println("----------------------");
		
	}
}
