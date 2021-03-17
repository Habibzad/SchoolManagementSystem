package studentDataBase;

public class StudentID {
	private static int id = 1000;
	
	public static int getID() {
		return id++;
	}
}
