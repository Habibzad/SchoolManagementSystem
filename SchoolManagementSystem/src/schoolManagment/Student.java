package schoolManagment;

public class Student extends Member{
	//Instance variable
	private double grade;
	
	//Constructor
	public Student(String fName, String lName) {
		super(fName, lName);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
