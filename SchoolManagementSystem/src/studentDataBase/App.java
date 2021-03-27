package studentDataBase;

public class App {
	public static void main(String[] Args) {
		
		Student s1 = new Student("John", "Doe");
		Student s2 = new Student("Foo", "Boo");
		Student s3 = new Student("Liam", "Overtree");
		
		Teacher t1 = new Teacher("Alam", "Khan");
		
		School RabiaHigh = new School("Rabia");
		
		StudentsClass A1 = new StudentsClass("1A", t1);
		
		A1.addStudent(s1);
		A1.addStudent(s2);
		A1.addStudent(s3);
		
		RabiaHigh.addClass(A1);
		for(Student student: A1.studentsList) {
			System.out.println(student);
		}
		
		System.out.println("G1 class has "+ A1.getClassSize() + " students\n");
		
	}
}
