package schoolManagment;

import java.util.ArrayList;

public class School {
	//Instance variables
	private String schoolName;
	//List of students, teachers and employees
	private ArrayList<Class> classesList;
	private ArrayList<Teacher> teachersList;
	private ArrayList<Employee> employeesList;
	
	//Constructor
	public School(String schoolName) {
		this.schoolName = schoolName;
		classesList = new ArrayList<Class>();
		teachersList = new ArrayList<Teacher>();
		employeesList = new ArrayList<Employee>();
	}
	
	//Getters
	public String getSchoolName() {
		return schoolName;
	}
	
	public int getNumberOfClasses() {
		return classesList.size();
	}
	
	public int getTotalTeachers() {
		return teachersList.size();
	}
	
	public int getTotalNumberOfStudents() {
		int total = 0;
		for(Class theClass: classesList) {
			total+=theClass.getClassSize();
		}
		return total;
	}
	
	//Add class
	public void addClass(Class Class) {
		classesList.add(Class);
	}
	
	public void addTeacher(Teacher teacher) {
		teachersList.add(teacher);
	}
	
	//Search Teacher 
	public Teacher searchTeacher(String teacherName){
		for(Teacher teacher : teachersList){
			if(teacher.getName().equals(teacherName)){
				return teacher;
			}
		}
		return null;
	}
	
	public void printTeachersList() {
		int i = 1;
		for(Teacher teacher : teachersList) {
			System.out.println(i+": "+teacher.getId()+" "+teacher.getName());
			i++;
		}
	}
	
	public void printClassList() {
		int i = 1;
		for(Class theClass : classesList) {
			System.out.println(theClass);
			i++;
		}
	}

}
