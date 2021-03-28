package schoolManagment;

public class Employee extends Member {
	//Instance variables
	private double salary;
	
	public Employee(String fName, String lName) {
		super(fName, lName);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>2000 && salary<5000) {
			this.salary = salary;
		}else {
			System.out.println("Salary range is between $2000 and $5000");
		}
	}

}
