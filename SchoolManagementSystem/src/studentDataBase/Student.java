package studentDataBase;

import java.util.ArrayList;

public class Student {
	private String fName;
	private String lName;
	private int id;
	private ArrayList<String> classes = new ArrayList<String>();
	
	public Student(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = StudentID.getID();
	}
	
	public void addClass(String className) {
		classes.add(className);
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " - Name: " + fName + " " + lName;
	}
	
}
