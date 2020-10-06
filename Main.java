import java.util.Scanner;
/**
 *
 * @author  Andrew kamal
 */
public class Main {
 /** prompts the user to enter in a positive integer it will then calculate the sum of all of the digits in that integer.
 * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in); // Scanner for input
    int userNum  ;                       // declare varbile to store th number enterted by the user                     
do{
  System.out.println(" Enter a positive integer:");           //asks the user for a positive integer      
	 userNum = input.nextInt();
}while(userNum <= 0);                                       // do while loop


int count = 0;
// intaulize  varbiles so it start counting at one
	 
	System.out.println("The factors of " + userNum + " are:");// despla123y message 
while(userNum >= count){                                 // runs until the intager is equal or lager than the user number 
  count = count + 1;                                         // adds and counts up by one

if(userNum % count == 0){                                   // take the reaminder
	 System.out.println(count);

  
        
      } 
    }
  }
}
