package cleancode.chapter2.meaningfulname.meaningfulcontext;

public class MeaningfulContextDemo {
	
	public static void print(String guessMessage) {
		System.out.println(guessMessage);
	}
	
	private void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);

		print(guessMessage);
	}
	
	// Main 
	public static void main(String[] args) {
		new MeaningfulContextDemo().printGuessStatistics('A', 0); // There are no As
		new MeaningfulContextDemo().printGuessStatistics('B', 1); // There is 1 B
		new MeaningfulContextDemo().printGuessStatistics('C', 2); // There are 2 Cs
	}
}
