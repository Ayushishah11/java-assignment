// Check if the given character is a vowel or consonant without using methods.  Do the same program by passing the char to a static method and returning the result.

package Java;

import java.util.Scanner;

public class ProVowel {

    public static String vowel(char ch) 
{
		
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
	return ch+" Character is vowel";
			}
    else {
				
       return ch+" Character is consonant";
			}
}
	
   public static void main(String[] args) {

       ProVowel v = new ProVowel();		
       System.out.println(v.vowel('a'));
		
            }
}

/*a Character is vowel*/