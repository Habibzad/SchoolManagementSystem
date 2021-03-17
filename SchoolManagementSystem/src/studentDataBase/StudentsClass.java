package studentDataBase;

import java.util.ArrayList;

public class StudentsClass {
	ArrayList<Student> studentsList = new ArrayList<Student>();
	//int classLimit = 5;
	
	public void addStudent(Student student) {
		studentsList.add(student);
	}
	
	public int getClassSize() {
		return studentsList.size();
	}
}
