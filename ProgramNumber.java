// Print odd numbers from 1 to 10 using for, while, do-while.

package Java;

public class ProgramNumber {

    public static void main(String[] args) 
{
		
	System.out.println("Odd Numbers");
		
        for(int i = 0; i <= 10; i++) {
			
        if(i % 2 != 0) {
				
        System.out.println(i);
			}
		}
	}
}

/*Odd Numbers
1
3
5
7
9
*/