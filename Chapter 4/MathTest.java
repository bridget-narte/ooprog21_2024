import java.util.Scanner;
public class MathTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Find the SQUAREROOT: ");
		double squareRoot = scan.nextDouble();

		System.out.print("Find the SIN: ");
		double sineINPUT = scan.nextDouble();

		System.out.print("Find the COS: ");
		double cosINPUT = scan.nextDouble();

		System.out.print("Find the FLOOR: ");
		double floorINPUT = scan.nextDouble();

		System.out.print("Find the CEIL: ");
		double ceilINPUT = scan.nextDouble();

		System.out.print("Find the ROUND: ");
		double roundINPUT = scan.nextDouble();

		System.out.print("Enter first number to find MAX/MIN: ");
		double num1 = scan.nextDouble();

		System.out.print("Enter second numberto find MAX/MIN: ");
		double num2 = scan.nextDouble();


		System.out.println("SQRT: " + Math.sqrt(squareRoot));
		System.out.println("SIN: " + Math.sin(sineINPUT));
		System.out.println("COS: " + Math.cos(cosINPUT));
		System.out.println("FLOOR: " + Math.floor(floorINPUT));
		System.out.println("CEIL: " + Math.ceil(ceilINPUT));
		System.out.println("ROUND: " + Math.round(roundINPUT));
		System.out.println("MAX: " + Math.max(num1,num2));
		System.out.println("MIN: " + Math.min(num1,num2));
		System.out.println("RANDOM: " + Math.random());


		;


	}
}
