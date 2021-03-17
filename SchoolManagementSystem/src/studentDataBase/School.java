package studentDataBase;

import java.util.ArrayList;

public class School {
	ArrayList<StudentsClass> classList = new ArrayList<StudentsClass>();
	
	public void addClass(StudentsClass studentsClass) {
		classList.add(studentsClass);
	}
	
	public int getNumberOfClasses() {
		return classList.size();
	}
	
	public int getTotalNumberOfStudents() {
		int total = 0;
		for(StudentsClass theClass: classList) {
			total+=theClass.getClassSize();
		}
		return total;
	}
}
