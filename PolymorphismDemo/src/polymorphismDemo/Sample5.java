package polymorphismDemo;

public class Sample5 {

	public static void main(String[] args) {
		
		 Demo2 obj2= new Demo2();
	      double result = obj2.myMethod(10,10);
	      double result2 = obj2.myMethod(20,12);
	      
	      System.out.println(result);
	      System.out.println(result2);
	      
	      System.out.println("The first method was called for both of the results. The second method was never called.");
	      System.out.println("The second method was never called.");
	      
	}

}
