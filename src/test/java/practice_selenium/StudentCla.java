package practice_selenium;

public class StudentCla {
	String name;
//StudentCla(String name){
//	this.name= name;
//     /// super();	
//	
//	}

	int age;
	
	public static String collegeName= "KEC";
	public static String newCollegeName = "";
	private int RollNumber = 99;
	
	public int getRollNumber() {
		return RollNumber;
	}

	// private : u need gettre and Setter to Accessthe variable 
	 protected  int setRollNumber(int rollNumber) {
		return RollNumber = rollNumber;
	}



	char gender;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String chanageCollegename(String newCollegeName) {

		newCollegeName = collegeName;
		return collegeName;

	}

	// behaviour

	public void selectCourse() {
		
		System.out.println("Select Course");
		
		

	}

}
