public class MovieQuoteInfor {
	static void myMovieQuoteInfo(String movieQuote,String charName, String movieTitle, int movieYear) {
		System.out.println("Movie Quote: \n\t" + movieQuote);
		System.out.println("\n Title of the movie: \n\t" + movieTitle);
		System.out.println("\n Character Name: \n\t" + charName);
		System.out.println("\n Year of the Movie: \n\t" +movieYear);


	}

	public static void main(String[] args) {
		myMovieQuoteInfo("\"One often meets his destiny on the road he takes to avoid it. You are too concerned about what was and\n what will be. There's a saying: Yesterday is history, tomorrow is a mystery, but today is a gift. That\'s why it\'s called the present.\"", "Master Oogway", "Kung Fu Panda", 2008);

	}
}