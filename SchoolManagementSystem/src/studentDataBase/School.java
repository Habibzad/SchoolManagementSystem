package studentDataBase;

import java.util.ArrayList;

public class School {
	private String schoolName;
	//List of students
	private ArrayList<StudentsClass> classList = new ArrayList<StudentsClass>();
	private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	//Constructor
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//Getters
	public String getSchoolName() {
		return schoolName;
	}
	
	public int getNumberOfClasses() {
		return classList.size();
	}
	
	public int getTotalTeachers() {
		return teacherList.size();
	}
	
	public int getTotalNumberOfStudents() {
		int total = 0;
		for(StudentsClass theClass: classList) {
			total+=theClass.getClassSize();
		}
		return total;
	}
	
	//Add class
	public void addClass(StudentsClass studentsClass) {
		classList.add(studentsClass);
	}
}
