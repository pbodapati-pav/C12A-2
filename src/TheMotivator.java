public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're the GOAT");
		else if (score > 90)
			System.out.println("Excellent work");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}