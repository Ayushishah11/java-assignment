// Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.

package Java;

public class ProgramMark {  
	   public static void main(String[] args) 
{  
	      int mark = 49;   
	      System.out.println("The mark is " + mark);
	 
	      // if-else statement
	      if ( mark >=50 ) {
	         System.out.println( "Pass" );
	      } else {
	         System.out.println( "Fail" );
	      }
	     
	   }
}
/*The mark is 49
Fail*/