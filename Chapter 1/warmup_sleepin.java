// Name:Bridget D. Narte
// Warm-up Exercise: - Sleep-In

public class warmup_sleepin {
	public static boolean sleepIn(boolean WeekDay, boolean Vacation) {
		return !WeekDay || Vacation;
	}

	public static void main(String[] args) {

		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(false, true));

	}
}