package schoolManagment;

public class Teacher extends Member{
	
	//Instance variables
	private double salary;
	
	public Teacher(String fName, String lName) {
		super(fName, lName);
	}

	public double getSalary() {
		return salary;
	}

	public boolean setSalary(double salary) {
		if(salary>2000 && salary<5000) {
			this.salary = salary;
			return true;
		}else {
			return false;
		}
	}

}
