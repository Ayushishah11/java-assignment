// Print even numbers from 1 to 10 using for, while, do-while.

package Java;


public class ProgramEven {

    public static void main(String[] args) 
{

        System.out.println("Even Numbers");

	for(int i = 0; i <= 10; i++) {
			
	if(i % 2 == 0) {
				
	System.out.println(i);
			}
		}
	}
}
/*Even Numbers
0
2
4
6
8
10
*/