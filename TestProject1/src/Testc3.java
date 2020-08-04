
public class Testc3 {

	public static void main(String[] args) {
		
		//based on the age will print if user is eligible to vote or not
		
		int age = 29;
		char country = 'U';
		if(country=='U') 
	    {
            System.out.println("The country is "+ country);
			
			if(age>=21) 
			{
				System.out.println("The user is eligible to vote because there age is " + age);
				System.out.println("This is statement 2 when condition is true");
			}
			else {
			System.out.println("The user is not eligible to vote because there age is " + age);
			}
		}
		else
		{
			System.out.println("The user is not eligible to vote because there country is " + country);
			if(age<=20) {
				System.out.println("This is just an example to show that if can be written inside else blocks as well");
			}
		}
		
		
		
		
		

	}

}
