// Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder depending on the mathematical operator value. (Use switch statement).

package Java;

import java.util.Scanner;

public class ProgramAdd {

    public static void main(String[] args) 
{

	int n1 = 20;
	int n2 = 10;
		
	System.out.println("Enter the Operators to perform Operations : ");
	Scanner sc = new Scanner(System.in);
	char sum = sc.next().charAt(0);
		
	switch(sum) {
		
		case '+':
			System.out.println("Sum of "+n1+" + "+n2+" is : "+(n1 + n2));
			break;
			
		case '-':
			System.out.println("Difference of "+n1+" - "+n2+" is : "+(n1 - n2));
		    break;
			
		case '*':
			System.out.println("Product of "+n1+" * "+n2+" is : "+(n1 * n2));
			break;
			
		case '/':
			System.out.println("Quotient of "+n1+" / "+n2+" is : "+(n1 / n2));
			break;
			
                default:
	    	System.out.println("Invalid Operation");
			
		}
	}
}

/*Enter the Operators to perform Operations : 
-
Difference of 20 - 10 is : 10*/