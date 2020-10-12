package polymorphismDemo;

public class Demo2 {
	
	//Using the same datatypes and arguments for the two methods (myMethod) gave an error. 
	//This means: These methods cannot have the same datatypes with the same number of arguments(i.e duplicate method).
	// I changed the datatype of the second method to short and integer but with the same number of arguments with the first method.
	 public double myMethod(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return num1+num2;
	   }
	   public int myMethod(int  var1, short var2)
	   {
	      System.out.println("Second myMethod of class Demo");
	      return var1-var2;
	   }
}


