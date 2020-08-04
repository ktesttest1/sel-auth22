
public class Student1 {
	
	int id ;
	String name ;
	
	//parameterized constructor
/*	
Student1(int i, String n){
	id= i;
	name = n;
}

*/
	/*
	
	public void studentDetails() {
		System.out.println("The id of a student is" + id + "The name of student is " + name);
	}
	
	*/

	
	public void studentDetails(int id, String name) {
		
		System.out.println("The id of a student is" + id + "The name of student is " + name);
	}
	
	public static void main(String[] args) {
	
		//Declaration, instantiation and Initialization 
		Student1 s1 = new Student1();
		
		s1.studentDetails(1, "TEST");

	}

}
