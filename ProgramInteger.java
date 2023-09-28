// Initialize an int array, char array and a string array with values.


package Java;

public class ProgramInteger {

    public static void main(String[] args) 
{
		
	int[] no = {14,44,22,41,50};
	String[] str = {"Sham"};
	char[] c = {'S','h','a','m'};
		
	System.out.println("Integer Array Initialization : ");
    for(int n1 : no) {
			
	System.out.println(n1);
		}
		
	System.out.println("String Array Initialization : ");
		
    for(String st : str) {
			
	System.out.println(st);
		}
		
	System.out.println("String Array Initialization : ");
		
    for(int i = 0; i<c.length; i++) {
			
	System.out.println(c[i]);
		}
	}
}

/*Integer Array Initialization : 
	14
	44
	22
	41
	50
	String Array Initialization : 
	Sham
	String Array Initialization : 
	S
	h
	a
	m*/
