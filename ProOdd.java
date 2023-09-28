// Print odd numbers from 1 to 10 using for, while, do-while.

package Java;

public class ProOdd {

    public static void main(String[] args) 
{
		
         System.out.println("Odd Numbers");

	int i = 0;
		
	while(i <= 10) {
			
	if(i % 2 != 0) {
				
        System.out.println(i);
			}
	i++;
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