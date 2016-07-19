package introduction_to_java.Assignment_4;

public class SolvingExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Assume that the integer variable x is 5 and the integer variable y is 10. Give the values of the following
		expressions:
		a. x + y * 2
		b. x - y + 2
		c. (x+y) * 2
		d. y % x*/
		
		int x = 5;
		int y = 10;
		
		int a,b,c,d;
		
		a = x+y*2;		
		b = x-y*2;		 
		c = (x+y)*2;		
		d = y%x;
		
		System.out.println("Value of 'a' is = " + a);
		System.out.println("Value of 'b' is = " + b);
		System.out.println("Value of 'c' is = " + c);
		System.out.println("Value of 'd' is = " + d);

	}

}
