package studentDataBase;

public class App {
	public static void main(String[] Args) {
		School school = new School();
		
		StudentsClass G1 = new StudentsClass();
		school.addClass(G1);
		Student s1 = new Student("John", "Doe");
		Student s2 = new Student("Foo", "Boo");
		Student s3 = new Student("Liam", "Overtree");
		
		G1.addStudent(s1);
		G1.addStudent(s2);
		G1.addStudent(s3);
		
		for(Student student: G1.studentsList) {
			System.out.println(student);
		}
		
		System.out.println("G1 class has "+ G1.getClassSize() + " students\n");
		
		StudentsClass G2 = new StudentsClass();
		school.addClass(G2);
		G2.addStudent(new Student("Lisa", "Farmer"));
		G2.addStudent(new Student("George", "Laurel"));
		G2.addStudent(new Student("Luca", "Antonili"));
		G2.addStudent(new Student("Sara", "Borati"));
		
		for(Student student: G2.studentsList) {
			System.out.println(student);
		}
		
		System.out.println("G2 class has "+ G2.getClassSize() + " students");
		System.out.println("===========");
		System.out.println("Number of classes: "+school.getNumberOfClasses()+"\n");
		
		System.out.println("==================");
		System.out.println("Total Number of Students: "+ school.getTotalNumberOfStudents());
	}
}
