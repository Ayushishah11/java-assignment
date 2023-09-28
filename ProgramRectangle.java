// Area and perimeter of rectangle – once without using methods and once using static methods for area & perimeter.

package Java;

public class ProgramRectangle {

    public static void main(String[] args) 
{
		
          int length = 4;
	    int breadth = 8;
	    int perimeter, area;
		
	    area = length * breadth;
         perimeter = 2 * length + breadth;
		
	 System.out.println("Area of rectangle is : "+area);
		
	 System.out.println("Perimeter of rectangle is : "+perimeter);
		
	}
}

/*Area of rectangle is : 32
Perimeter of rectangle is : 16
*/