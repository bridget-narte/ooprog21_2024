import java.util.*;
public class SammysRentalPrice {
    public static void main (String[]args){

        Scanner x = new Scanner(System.in);
        int RENTAL_COSTS = 40;

        System.out.print("Enter the number of minutes: ");
        int numMinutes = x.nextInt();
        int numHours = numMinutes / 60;
        int addMinutes = numMinutes % 60;
        int rateHours = numHours * 40;
        int totalPrice =  rateHours + addMinutes;

        System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.println("Number of Hours:      " + numHours);
        System.out.println("Additional Minutes:   " + addMinutes);
        System.out.println("Total Price:         $" + totalPrice);



    }
}
