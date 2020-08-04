
public class Testc6 {

	public static void main(String[] args) {
		
		sumNums(1,2,3);
		Testc6 c1 = new Testc6();
		
		
		int n = sumNums1(2,3,4);
		System.out.println("The value of 3 nums jkhkjhkjhk jkhjkhjk kis " + n);
		sumNums2();
		int n1 = sumNums3();
		System.out.println("The value of 3 nums is " + n1);
		}
	//with arguments and without return type
	public static void sumNums(int a, int b , int c)
	{
		int d = a+b+c;
		System.out.println("The value is " + d);
		
	}
	
	//with arguments and with return type
	public static int sumNums1(int a, int b , int c)
	{
		int d = a+b+c;
		//System.out.println("The value is " + d);
		return d;
		
	}
	
	//without arguments and no return type
	public static void sumNums2()
	{
		int a = 15;
		int b = 16;
		int c = 19;
		int d = a+b+c;
		System.out.println("The value is " + d);
	}
	
	//without arguments but with return type
	public static int sumNums3()
	{
		int a = 15;
		int b = 16;
		int c = 19;
		int d = a+b+c;
		
		return d;
	}
	

}
