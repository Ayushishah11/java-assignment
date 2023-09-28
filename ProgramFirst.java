// Declare 2 double variables and display their difference.

package Java;

import java.util.Scanner;

public class ProgramFirst {
	
	public static void main(String[] args) 
{
		
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
            double c1 = in.nextDouble();
            System.out.print("Input second number: ");
            double c2 = in.nextDouble();
		 System.out.println(c1 > 0 && c1 < 1 && c2 > 0 && c2 < 1);
		 
		 
	}
}

/*Input first number: 20
Input second number: 30
false
*/