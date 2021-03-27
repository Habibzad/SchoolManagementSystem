package studentDataBase;

public class ID {
	private static int id = 1000;
	
	public static int getID() {
		return id++;
	}
}
