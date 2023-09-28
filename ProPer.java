// Area and perimeter of rectangle – once without using methods and once using static methods for area & perimeter.

package Java;

public class ProPer {

    public static int area(int len, int bre) 
{
		
	return len * bre;
}
	
    public static int perimeter(int len, int bre) {
		
	return 2 * len + bre;
}

    public static void main(String[] args) {

	ProPer a = new ProPer();
		
	System.out.println("Area of rectangle is : "+a.area(3,6));
		
	System.out.println("Perimeter of rectangle  is : "+a.perimeter(4,8));
		
	}
}

/*Area of rectangle is : 18
Perimeter of rectangle  is : 16
*/