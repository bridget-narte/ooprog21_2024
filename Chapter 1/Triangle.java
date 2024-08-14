
public class Triangle
{
	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++)
		{
			for (int j = 1; j <= 7 - i; j++)
				System.out.print (" ");

			for (int j = 1; j <= i; j++)
				System.out.print ("T");

			for (int j = i - 1; j >= 1; j--)
				System.out.print ("T");


			System.out.print ("\n");

		}
	}
}
