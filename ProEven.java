// Print even numbers from 1 to 10 using for, while, do-while.

package Java;

public class ProEven {

    public static void main(String[] args)
 {
		
	System.out.println("Even Numbers");
	
        int i = 0;
		
	while(i <= 10) {
			
	if(i % 2 == 0) {
	
        System.out.println(i);
			}
	i++;
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