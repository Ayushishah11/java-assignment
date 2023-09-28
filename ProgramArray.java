package Java;
// Store 5 integers in an array and print in reverse order.

public class ProgramArray {

    public static void main(String[] args) 
{
		
         System.out.println("Original array is :");
		
         int[] arr = {16,32, 35, 11, 50};
		
           for (int arr1 : arr) {
			
         System.out.println(arr1);
		}
		
	   System.out.println("Reverse array is :");
		
int the;
		
    for(int i = arr.length; i >=1 ; i--) {
			
	the = i;
			
	System.out.println(the);
		}
	}
}

/*Original array is :
16
32
35
11
50
Reverse array is :
50
11
33
32
16*/
