package schoolManagment;

import java.util.ArrayList;

public class Class {
	//Instance variables
	private String classGrade;
	private Teacher teacher;
	private ArrayList<Student> studentsList = new ArrayList<Student>();
	
	//Constructor
	public Class(String classGrade) {
		this.classGrade = classGrade;
	}

	//Getters and setters
	public int getClassSize() {
		return studentsList.size();
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public String getClassGrade() {
		return classGrade;
	}
	
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}
	
	public void addStudent(Student student) {
		studentsList.add(student);
	}
	
	public boolean addTeacher(Teacher teacher) {
		//Check if the class has a teacher
		if(this.teacher == null) {
			this.teacher = teacher;
			return true;
		}
		return false;
	}
	
	public void assignTeacher(Teacher teacher) {
		this.teacher = teacher; 
	}
	
	//Print students list
	public void printStudentsList() {
		int i = 1;
		for(Student student: studentsList) {
			System.out.println(i+" "+student.getName());
			i++;
		}
	}

	@Override
	public String toString() {
		return "Class [classGrade=" + classGrade + "]";
	}
	
	
}
