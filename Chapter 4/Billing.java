import java.util. *;
public class Billing {

    public void computeBill(double price) {
        double total = price + (price * 0.08); 
        System.out.println("The total price for the bill is: " + total);
    }

    public void computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * 0.08);
        System.out.println("The total price for the bill is: " + total);
    }

    public void computeBill(double price, int quantity, int couponDiscount) {
        double discount = (price * quantity) - couponDiscount;
        double total = discount + (discount * 0.08) ;
        System.out.println("The total price for the bill is: " + total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Billing billing = new Billing();

        System.out.print("Enter double price: "); //23.2
        double price = scan.nextDouble();
        billing.computeBill(price);
        System.out.println();
        
        System.out.print("Enter double price: "); //24.4
        price = scan.nextDouble();
        System.out.print("Enter int quantity: "); //2
        int quantity = scan.nextInt();
        billing.computeBill(price,quantity);
        System.out.println();
        
        System.out.print("Enter double price: "); //25.3
        price = scan.nextDouble();
        System.out.print("Enter int quantity: "); //3
        quantity = scan.nextInt();
        System.out.print("Enter coupon discount: "); //5
        int couponDiscount = scan.nextInt();
        billing.computeBill(price,quantity,couponDiscount);
        System.out.println();
              
    }
}
