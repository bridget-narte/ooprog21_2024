public class TableAndChairs {
	public static void main(String args[])
	{
		int i, j;
		for (i = 0; i < 2; i++) {
			for (j = 0; j <= 25; j++) {
				if (j == 0 || j == 25) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		for (i = 0; i < 1; i++) {
			for (j = 0; j <= 25; j++) {
				if (j == 0 || j > 6 && j < 19 ||  j == 25) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		for (i = 0; i < 1; i++) {
			for (j = 0; j <= 25; j++) {
				if ( j < 5 && j < 18|| j ==7 || j==18 || j > 20 || j == 25) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		for (i = 0; i < 1; i++) {
			for (j = 0; j <= 25; j++) {
				if ( j == 0 || j==4 || j ==7 || j==18 || j == 21 || j == 25) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
		for (i = 0; i < 1; i++) {
			for (j = 0; j <= 25; j++) {
				if ( j == 0 || j==4 || j ==7 || j==18 || j == 21 || j == 25) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
	}


}