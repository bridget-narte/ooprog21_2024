import java.util.*;
public class AscendingAndDescending
{
	public static void main(String[] args) {
	    Scanner x = new Scanner (System.in);
	    
		System.out.print("Enter the first number: ");
		int numOne = x.nextInt();
		
		System.out.print("Enter the second number: ");
		int numTwo = x.nextInt();
		
		System.out.print("Enter the third number: ");
		int numThree = x.nextInt();
		
		if (numOne <= numTwo && numTwo <= numThree) {
		    System.out.println(numOne + " " + numTwo + " " + numThree);}
		    
		else if (numOne <= numThree && numThree <= numTwo) {
		    System.out.print("Ascending:");
		    System.out.println(numOne + " " + numThree + " " + numTwo);
		    System.out.print("Descending:");
		    System.out.println(numTwo + " " + numThree + " " + numOne);}

		else if (numTwo <= numOne && numOne <= numThree) {
		    System.out.print("Ascending:");
		    System.out.println(numTwo + " " + numOne + " " + numThree);
		    System.out.print("Descending:");
		    System.out.println(numThree + " " + numOne + " " + numTwo);}
		    
        else if (numTwo <= numThree && numThree <= numOne) {
 		    System.out.print("Ascending:");
		    System.out.println(numTwo + " " + numThree + " " + numOne);
		    System.out.print("Descending:");
		    System.out.println(numOne + " " + numThree + " " + numTwo);}
		    
        else if (numThree <= numOne && numOne <= numTwo) {
            System.out.print("Ascending:");
		    System.out.println(numThree + " " + numOne + " " + numTwo);
		    System.out.print("Descending:");
		    System.out.println(numTwo + " " + numOne + " " + numThree);}

		    
        else if (numThree <= numTwo && numTwo <= numOne) {
            System.out.print("Ascending:");
		    System.out.println(numThree + " " + numTwo + " " + numOne);		    
		    System.out.print("Descending:");
		    System.out.println(numOne + " " + numTwo + " " + numThree);}		    
	
		}
	

}
