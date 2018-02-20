package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		int a =10;
		int b= 7;
		
		// Subtract numbers
		int result = i-j;
		int sum= a+b;
		int multiple = i*j;
		int divide = a/b;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers

		i=i+5;
		j= j-3;

		System.out.println("Sum ="+sum);
		
		// Print result
		System.out.println("Divide =" + divide);

		
	}

}
