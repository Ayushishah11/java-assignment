// Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference.

package Java;

public class ProgramCircle {

    public static void main(String[] args) 
{
		
	double area, circumference;
	double radius = 12;
	double PI = 3.14;
		
	area = 3.14 * radius * radius;
		
	circumference = 2 * 3.14 * radius;
		
	System.out.println("Area of circle  is : "+area);
		
	System.out.println("Circumference of circle  is : "+circumference);
		
	}
}
/*Area of circle  is : 452.15999999999997
Circumference of circle  is : 75.36
*/