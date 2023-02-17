package cleancode.chapter2.meaningfulname.meaningfulcontext;
/*
 	 The function of UnclearContextDemo.java is a bit too long and the variables are used throughout. 
 	 
 	 To split the function into smaller pieces we need to create a GuessStatisticsMessage class and make the three variables fields of this class. 
 	 
 	 GuessStatisticsMessage provides a clear context for the three variables. 
 	 
 	 They are definitively part of the GuessStatisticsMessage. 
 	 
 	 The improvement of context also allows the algorithm to be made much cleaner by breaking it into many smaller functions. 
*/
	
public class GuessStatisticsMessage {

	private String number;
	private String verb;
	private String pluralModifier;

	public String make(char candidate, int count) {
		createPluralDependentMessageParts(count);
		return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
	}

	private void createPluralDependentMessageParts(int count) {
		if (count == 0) {
			thereAreNoLetters();
		} else if (count == 1) {
			thereIsOneLetter();
		} else {
			thereAreManyLetters(count);
		}
	}

	private void thereAreManyLetters(int count) {
		number = Integer.toString(count);
		verb = "are";
		pluralModifier = "s";
	}

	private void thereIsOneLetter() {
		number = "1";
		verb = "is";
		pluralModifier = "";
	}

	private void thereAreNoLetters() {
		number = "no";
		verb = "are";
		pluralModifier = "s";
	}
	
	public static void main(String[] args) {
		String result = new GuessStatisticsMessage().make('K', 3);
		System.out.println(result);
	}
}

/*
	Console:
		
			There are 3 Ks
*/