// Initialize 2 variables and find the sum, difference, product, quotient and remainder.  Do it using static methods and without static methods.

package Java;

public class ProSum {

    public static int add(int f, int g) 
{
		
	return f + g;
}
	
    public static int diff(int f, int g) 
{
		
	return f + g;
}
	
    public static int product(int f, int g) 
{
	
	return f - g;
}

    public static int qoutient(int f, int g) 
{
	
	return f / g;
}

    public static int remainder(int f, int g) 
{
	
	return f % g;
}

	
    public static void main(String[] args) 
{

	Pro6 op = new Pro6();
		
        System.out.println("Sum of f + g is : "+op.add(40, 20));
		
	    System.out.println("Difference of f - g is : "+op.diff(40, 20));
		
	    System.out.println("Product of f * g is : "+op.product(40, 20));
		
	    System.out.println("Quotinet of f / g is : "+op.qoutient(40, 20));
		
	    System.out.println("Remainder of f % g is : "+op.remainder(40, 20));
		
	}
}

/*Sum of f + g is : 60
Difference of f - g is : 60
Product of f * g is : 20
Quotinet of f / g is : 2
Remainder of f % g is : 0
*/







