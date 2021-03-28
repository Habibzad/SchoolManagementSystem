package schoolManagment;

public class App {
	public static void main(String[] Args) {
		//Create school object
		School school = new School("EastBrook Elementary");
		
		//Create student objects
		Student s1 = new Student("John", "Doe");
		Student s2 = new Student("Aria", "Lincoln");
		Student s3 = new Student("Hannah", "Christopher");
		
		//Create teacher objects
		Teacher t1 = new Teacher("Lisa", "Baldini");
		Teacher t2 = new Teacher("David", "Matthews");
		Teacher t3 = new Teacher("Sam", "Stevensen");
		
		//Add teachers to the teachers list
		school.addTeacher(t1);
		school.addTeacher(t2);
		school.addTeacher(t3);
		
		//Print teachers list
		System.out.println("List of Teachers");
		System.out.println("No"+": "+"ID"+"\t"+"Name");
		System.out.println("-------------------------");
		school.printTeachersList();
		
		//Create class
		Class g1A = new Class("G1A");
		
		//Add the class in the school class list
		school.addClass(g1A);
		
		//Add teacher and students
		g1A.addTeacher(t1);
		g1A.addStudent(s1);
		g1A.addStudent(s2);
		g1A.addStudent(s3);

		System.out.println("G1 class has "+ g1A.getClassSize() + " students\n");
		
		//Create more student objects
		Student s4 = new Student("Olivia", "Oliver");
		Student s5 = new Student("Liam", "James");
		Student s6 = new Student("Elijah", "Benjamin");
		Student s7 = new Student("Sophia", "Mason");
		Student s8 = new Student("Abigail", "Jackson");
		Student s9 = new Student("Samuel", "Owen");
		
		//Create the second class 
		Class g1B = new Class("G1B");
		
		//Add the class in the school class list
		school.addClass(g1B);
		
		//Add teacher and students
		g1B.addTeacher(t2);
		g1B.addStudent(s4);
		g1B.addStudent(s5);
		g1B.addStudent(s6);
		g1B.addStudent(s7);
		g1B.addStudent(s8);
		g1B.addStudent(s9);
		
		System.out.println("\n");
		System.out.println(school.getSchoolName()+ " Classes:");
		school.printClassList();
	}
}
