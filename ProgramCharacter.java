// Check if the given character is a vowel or consonant without using methods.  Do the same program by passing the char to a static method and returning the result.

package Java;

import java.util.Scanner;

public class ProgramCharacter {

    public static void main(String[] args)  
{

	System.out.println("Enter character  : ");
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
		
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch 
      == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch ==            'O' || ch == 'U') {
			
	System.out.println(ch+" Character is vowel");
		}
	else {
			
        System.out.println(ch+" Character is consonant");
		}
	}
}
/*Enter character  : 
q
q Character is consonant
*/