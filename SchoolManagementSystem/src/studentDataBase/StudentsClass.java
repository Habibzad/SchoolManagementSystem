package studentDataBase;

import java.util.ArrayList;

public class StudentsClass {
	String classGrade;
	Teacher teacher;
	ArrayList<Student> studentsList = new ArrayList<Student>();
	
	public StudentsClass(String classGrade, Teacher teacher) {
		this.classGrade = classGrade;
		this.teacher = teacher;
	}

	public void addStudent(Student student) {
		studentsList.add(student);
	}
	
	public int getClassSize() {
		return studentsList.size();
	}
}
