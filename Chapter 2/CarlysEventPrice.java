import java.util.*;
public class CarlysEventPrice {
    public static void main (String[]args){
        Scanner x = new Scanner (System.in);
        int PRICE_PER_PERSON = 35;

        System.out.print("Enter the number of guests: ");
        int numGuest = x.nextInt();
        int totalPrice = numGuest * PRICE_PER_PERSON;
        boolean isLargeEvent = numGuest >= 50;

        System.out.println("\n**************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*           it a party.              *");
        System.out.println("**************************************");

        System.out.println("Number of guests:   " + numGuest);
        System.out.println("Price per person:  $" + PRICE_PER_PERSON);
        System.out.println("Total Price:       $" + totalPrice);
        System.out.println("The job is classified as a large event with 50 or more guests: " + isLargeEvent);








    }

}
