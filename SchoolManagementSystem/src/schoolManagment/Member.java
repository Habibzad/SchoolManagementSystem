package schoolManagment;

public class Member {
	//Instance variables
	private String fName;
	private String lName;
	private String id;
	
	//Constructor
	public Member(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		this.id = setId(); 
	}
	
	public String getName() {
		return fName + " " + lName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getId() {
		return id;
	}

	public String setId() {
		String firstNInitial = fName.substring(0,1);
		String lastNInitial = lName.substring(0, 1);
		this.id = firstNInitial+lastNInitial+ID.getID();
		return id;
	}
	
	@Override
	public String toString() {
		return "ID: "+ id + " | Name: " + fName + " " + lName;
	}
}
