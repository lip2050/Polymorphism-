package polymorphismDemo;

public class Sample4 {
	
	public static void main (String [] args) {
		
		  Demo obj1= new Demo();
	      int result = obj1.myMethod(10,10);
	      int result2 = obj1.myMethod(20,12);
	      
	      System.out.println(result);
	      System.out.println(result2);
	      
	      System.out.println("The first method was called for both of the results. The second method was never called.");
	      
	      
	
	}

}
