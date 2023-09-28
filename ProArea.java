// Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference.


public class ProArea {

    public static double area(double radius, double PI) 
{
	
	return PI * radius * radius;
}
	
    public static double circumference(double radius, double PI) {
    
        return 2 * PI * radius;
}
	
    public static void main(String[] args) {

		
    ProArea obj = new ProArea();
		
    System.out.println("Area of circle  is : "+obj.area(4, 3.14));
		
    System.out.println("Circumference of circle is : "+obj.circumference(4, 3.14));
		
		}
 }
/*Area of circle  is : 50.24
Circumference of circle is : 25.12
*/