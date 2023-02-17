package cleancode.chapter2.meaningfulname.meaningfulcontext;
/*
 	There are a few names which are meaningful in and of themselves—most are not. 
 
 	Instead, you need to place names in context for your reader by enclosing them in well-named classes, functions, or namespaces. 
 	
 	When all else fails, then prefixing the name may be necessary as a last resort. 
*/

public class UnclearContextDemo {
	
	private void print(String guessMessage) {
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
		new UnclearContextDemo().printGuessStatistics('A', 0); // There are no As
		new UnclearContextDemo().printGuessStatistics('B', 1); // There is 1 B
		new UnclearContextDemo().printGuessStatistics('C', 2); // There are 2 Cs
	}
}
