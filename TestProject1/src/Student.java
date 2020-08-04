
public class Student {
	
	//Instance variables
	int id;
	String name;
	
	
	//Static/class variable
	static String university = "CTEST";
	
	//constructor
	Student(int i, String n){
		id = i;
		name = n;
		
}
	
	//method
	public void studenDetails() {
		System.out.println("ID of the student is " + id  + " "+ "Name of the student is " + name + " University name is " + university);
	}
	
	public void studentBehavior(String btype) {
		System.out.println("This is behavior of " +  name  + "Behavior is " + btype);
	}

	public static void main(String[] args) {
		
		//local variable
		int b = 5;
		
		
		
		//declaration , instantiation , initialization
		Student s1 = new Student(1, "Ali");
		Student s2 = new Student(2, "Arshad");
		Student s3 = new Student(3, "Binjal");
		
		s1.studenDetails();
		s2.studenDetails();
		
		s1.studentBehavior("good");
		
		
		

	}

}
