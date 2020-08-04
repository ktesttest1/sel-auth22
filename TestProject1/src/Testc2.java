public class Testc2 {

	public static void main(String[] args) {
		/*
			int x = 5;
	        int y = 6;
	        int z = 7;
	        double d1 = 2.5;
	        double d2 = 3.5;
	        
	        */
	        int mvalue = timesNums(5,6, 6);
	        System.out.println("The product of the three numbers is " + mvalue);
	        double dvalue = timesDoub(2.5,3.5);
	        System.out.println("The product of these numbers is " + dvalue);
	    }
	
	
	    public static int timesNums(int x, int y, int z){
	        int value = x*y*z;
	      return value;
	    }
	    
	    
	    public static double timesDoub(double x, double y){
	        double value = x*y;
	        return value;
	    }


	


	}


